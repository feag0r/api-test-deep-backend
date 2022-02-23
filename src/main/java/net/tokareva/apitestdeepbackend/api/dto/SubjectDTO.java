package net.tokareva.apitestdeepbackend.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "subject")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "id", required = true)
    private UUID id;
    @XmlElement(name="subjectName", required = true)
    private String subjectName;
    @XmlElement(name="subjectAccounts")
    private List<AccountDTO> subjectAccounts;
    @XmlElement(name="subjectAttributes")
    private List<AttributeDTO> subjectAttributes;
}
