package net.tokareva.apitestdeepbackend.mapper;

import net.tokareva.apitestdeepbackend.api.dto.AttributeDTO;
import net.tokareva.apitestdeepbackend.entity.Attribute;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AttributeMapper {
    AttributeDTO toAttributeDTO(Attribute attribute);
}
