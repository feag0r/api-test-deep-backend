package net.tokareva.apitestdeepbackend.mapper;

import net.tokareva.apitestdeepbackend.api.dto.AccountDTO;
import net.tokareva.apitestdeepbackend.entity.Account;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountDTO toAccountDTO(Account account);
}
