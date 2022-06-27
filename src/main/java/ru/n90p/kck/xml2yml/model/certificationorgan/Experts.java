package ru.n90p.kck.xml2yml.model.certificationorgan;

import lombok.*;
import com.fasterxml.jackson.dataformat.xml.annotation.*;

import static ru.n90p.kck.xml2yml.XmlNamespaceConstants.*;

@Data
@JacksonXmlRootElement(localName = "Experts", namespace = tns)
public class Experts {
    @JacksonXmlProperty(localName = "Surname", namespace = tns)
    private String surname;
    @JacksonXmlProperty(localName = "Name", namespace = tns)
    private String name;
    @JacksonXmlProperty(localName = "Patronymic", namespace = tns)
    private String Patronymic;
}