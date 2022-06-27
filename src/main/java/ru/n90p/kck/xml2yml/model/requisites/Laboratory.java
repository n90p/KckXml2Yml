package ru.n90p.kck.xml2yml.model.requisites;

import lombok.*;
import com.fasterxml.jackson.dataformat.xml.annotation.*;

import static ru.n90p.kck.xml2yml.XmlNamespaceConstants.*;

@Data
@JacksonXmlRootElement(localName = "Laboratory", namespace = tns)
public class Laboratory {
    @JacksonXmlProperty(localName = "NumberReg", namespace = tns)
    private String numberReg;
    @JacksonXmlProperty(localName = "Name", namespace = tns)
    private String name;
    @JacksonXmlProperty(localName = "DateReg", namespace = tns)
    private String dateReg;
    @JacksonXmlProperty(localName = "DateExpiry", namespace = tns)
    private String dateExpiry;
    @JacksonXmlProperty(localName = "Document", namespace = tns)
    private String document;
    @JacksonXmlProperty(localName = "Info", namespace = tns)
    private String info;
}