package net.tokareva.apitestdeepbackend.api.dto;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "testTables")
@Getter
@Setter
public class TestTables {

    @XmlElement(name="testTable1s")
    private ArrayList<TestTable1> testTable1s;
}
