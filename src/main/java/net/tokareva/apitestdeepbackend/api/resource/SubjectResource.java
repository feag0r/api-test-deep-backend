package net.tokareva.apitestdeepbackend.api.resource;

import lombok.RequiredArgsConstructor;
import net.tokareva.apitestdeepbackend.api.dto.SubjectDTO;
import net.tokareva.apitestdeepbackend.entity.Subject;
import net.tokareva.apitestdeepbackend.mapper.SubjectMapper;
import net.tokareva.apitestdeepbackend.repository.SubjectRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

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
    public Response getAllSubjects() {
        List<Subject> all = subjectRepository.findAll();
        if (all.isEmpty()) {
            return Response.status(404).build();
        }
        List<SubjectDTO> result = subjectMapper.toSubjectDTOList(all);
        return Response
                .status(200)
                .entity(result)
                .build();
    }
}
