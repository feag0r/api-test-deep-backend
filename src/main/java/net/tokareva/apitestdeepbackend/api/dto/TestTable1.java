package net.tokareva.apitestdeepbackend.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.UUID;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "testTable1")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestTable1 implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "id")
    private UUID id;

    @XmlElement(name="testValue1")
    private String testValue1;

    @XmlElement(name="testTable2")
    private TestTable2 testTable2;
}
