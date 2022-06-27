package ru.n90p.kck.xml2yml.model.requisites;

import lombok.*;
import com.fasterxml.jackson.dataformat.xml.annotation.*;

import static ru.n90p.kck.xml2yml.XmlNamespaceConstants.*;

@Data
@JacksonXmlRootElement(localName = "Requisites", namespace = tns)
public class Requisites {
    @JacksonXmlProperty(localName = "Status", namespace = tns)
    private String status;
    @JacksonXmlProperty(localName = "Section", namespace = tns)
    private String section;
    @JacksonXmlProperty(localName = "Number", namespace = tns)
    private String number;
    @JacksonXmlProperty(localName = "DateReg", namespace = tns)
    private String dateReg;
    @JacksonXmlProperty(localName = "DateExpiry", namespace = tns)
    private String dateExpiry;
    @JacksonXmlProperty(localName = "NoExpiry", namespace = tns)
    private String noExpiry;
    @JacksonXmlProperty(localName = "BaseDeclaration", namespace = tns)
    private BaseDeclaration baseDeclaration;
    @JacksonXmlProperty(localName = "Discontinued", namespace = tns)
    private String discontinued;
}