package net.tokareva.apitestdeepbackend.mapper;

import net.tokareva.apitestdeepbackend.api.dto.SubjectDTO;
import net.tokareva.apitestdeepbackend.entity.Subject;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SubjectMapper {
    SubjectDTO toSubjectDTO(Subject subject);
    List<SubjectDTO> toSubjectDTOList(Iterable<Subject> subjects);
}
