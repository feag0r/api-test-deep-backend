package net.tokareva.apitestdeepbackend.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.UUID;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "account")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "id", required = true)
    private UUID id;
    @XmlElement(name="accountNumber", required = true)
    private String accountNumber;
    @XmlElement(name="isOpen", required = true)
    private boolean isOpen;
    @XmlElement(name="accountType")
    private AccountTypeDTO accountType;
}
