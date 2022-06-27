package ru.n90p.kck.xml2yml.model;

import lombok.*;
import com.fasterxml.jackson.dataformat.xml.annotation.*;

import static ru.n90p.kck.xml2yml.util.XmlNamespaceConstants.*;

@Data
@JacksonXmlRootElement(localName = "Address", namespace = tns)
public class Address {
    @JacksonXmlProperty(localName = "string", namespace = tns)
    private String string;
}