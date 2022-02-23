package net.tokareva.apitestdeepbackend.mapper;

import net.tokareva.apitestdeepbackend.api.dto.AccountTypeDTO;
import net.tokareva.apitestdeepbackend.entity.AccountType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountTypeMapper {
    AccountTypeDTO toAccountTypeDTO(AccountType accountType);
}
