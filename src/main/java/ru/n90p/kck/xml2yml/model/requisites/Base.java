package ru.n90p.kck.xml2yml.model.requisites;

import lombok.*;
import com.fasterxml.jackson.dataformat.xml.annotation.*;

import static ru.n90p.kck.xml2yml.XmlNamespaceConstants.*;

@Data
@JacksonXmlRootElement(localName = "Base", namespace = tns)
public class Base {
    @JacksonXmlProperty(localName = "string", namespace = tns)
    private String string;
}