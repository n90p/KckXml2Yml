package ru.n90p.kck.xml2yml.model.product;

import lombok.*;
import com.fasterxml.jackson.dataformat.xml.annotation.*;

import static ru.n90p.kck.xml2yml.XmlNamespaceConstants.*;

@Data
@JacksonXmlRootElement(localName = "TechRegs", namespace = tns)
public class TechRegs {
    @JacksonXmlProperty(localName = "TechReg", namespace = tns)
    private String techReg;
    @JacksonXmlProperty(localName = "TechRegInfo", namespace = tns)
    private String techRegInfo;
}