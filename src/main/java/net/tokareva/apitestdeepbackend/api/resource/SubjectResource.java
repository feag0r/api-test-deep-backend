package net.tokareva.apitestdeepbackend.api.resource;

import lombok.RequiredArgsConstructor;
import net.tokareva.apitestdeepbackend.entity.Subject;
import net.tokareva.apitestdeepbackend.mapper.SubjectMapper;
import net.tokareva.apitestdeepbackend.repository.SubjectRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "subjects")
@Path("/subjects")
@RequiredArgsConstructor
public class SubjectResource {

    private final SubjectRepository subjectRepository;
    private final SubjectMapper subjectMapper;

    @GET
    @Produces("application/json")
    @Transactional
    public Response getAllSubjects() throws URISyntaxException {
        List<Subject> all = subjectRepository.findAll();
        if (all.isEmpty()) {
            return Response.status(404).build();
        }
        return Response
                .status(200)
                .entity(subjectMapper.toSubjectDTOList(all))
                .contentLocation(new URI("/subjects")).build();
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    @Transactional
    public Response getSubjectById(@PathParam("id") UUID id) throws URISyntaxException
    {
        Optional<Subject> subjectOptional = subjectRepository.findById(id);
        if(subjectOptional.isEmpty()) {
            return Response.status(404).build();
        }
        return Response
                .status(200)
                .entity(subjectMapper.toSubjectDTO(subjectOptional.get()))
                .contentLocation(new URI("/subjects/"+id)).build();
    }
}
