package ru.n90p.kck.xml2yml.model.manufacturer;

import lombok.*;
import com.fasterxml.jackson.dataformat.xml.annotation.*;

import static ru.n90p.kck.xml2yml.XmlNamespaceConstants.*;

@Data
@JacksonXmlRootElement(localName = "Manufacturer", namespace = tns)
public class Manufacturer {
    @JacksonXmlProperty(localName = "Type", namespace = tns)
    private String type;
    @JacksonXmlProperty(localName = "ManufacturerUl", namespace = tns)
    private ManufacturerUl manufacturerUl;
    @JacksonXmlProperty(localName = "ManufacturerAl", namespace = tns)
    private String manufacturerAl;
    @JacksonXmlProperty(localName = "ManufacturerFl", namespace = tns)
    private String manufacturerFl;
}