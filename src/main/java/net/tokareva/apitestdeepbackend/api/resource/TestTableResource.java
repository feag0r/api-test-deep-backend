package net.tokareva.apitestdeepbackend.api.resource;

import lombok.RequiredArgsConstructor;
import net.tokareva.apitestdeepbackend.api.dto.TestTable1;
import net.tokareva.apitestdeepbackend.api.dto.TestTable2;
import net.tokareva.apitestdeepbackend.repository.TestTable1Repository;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "testTables")
@Path("/testTables")
@RequiredArgsConstructor
public class TestTableResource {

    private final TestTable1Repository testTable1Repository;

    @GET
    @Produces("application/json")
    public List<TestTable1> getAllTestTables() {
        List<net.tokareva.apitestdeepbackend.entity.TestTable1> all = testTable1Repository.findAll();
        List<TestTable1> result = new ArrayList<>();
        all.forEach(testTable1 -> {
            net.tokareva.apitestdeepbackend.entity.TestTable2 testTable2 = testTable1.getTestTable2();
            result.add(new TestTable1(testTable1.getId(), testTable1.getTestValue1(), testTable2 != null ? new TestTable2(testTable2.getId(), testTable2.getTestValue2()) : null));
        });
        return result;
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response getTestTableById(@PathParam("id") UUID id) throws URISyntaxException
    {
        Optional<net.tokareva.apitestdeepbackend.entity.TestTable1> testTable1 = testTable1Repository.findById(id);
        if(testTable1.isEmpty()) {
            return Response.status(404).build();
        }
        net.tokareva.apitestdeepbackend.entity.TestTable2 testTable2 = testTable1.get().getTestTable2();
        return Response
                .status(200)
                .entity(new TestTable1(testTable1.get().getId(), testTable1.get().getTestValue1(), testTable2 != null ? new TestTable2(testTable2.getId(), testTable2.getTestValue2()) : null))
                .contentLocation(new URI("/testTable1-management/"+id)).build();
    }
}
