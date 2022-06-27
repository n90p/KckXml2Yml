package ru.n90p.kck.xml2yml.model.requisites;

import lombok.*;
import com.fasterxml.jackson.dataformat.xml.annotation.*;

import static ru.n90p.kck.xml2yml.XmlNamespaceConstants.*;

@Data
@JacksonXmlRootElement(localName = "BaseDeclaration", namespace = tns)
public class BaseDeclaration {
    @JacksonXmlProperty(localName = "Documents", namespace = tns)
    private String documents;
    @JacksonXmlProperty(localName = "Schema", namespace = tns)
    private String schema;
    @JacksonXmlProperty(localName = "Base", namespace = tns)
    private Base base;
    @JacksonXmlProperty(localName = "Laboratory", namespace = tns)
    private Laboratory laboratory;
}