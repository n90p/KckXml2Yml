package ru.n90p.kck.xml2yml.model.manufacturer;

import lombok.*;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import ru.n90p.kck.xml2yml.model.*;

import static ru.n90p.kck.xml2yml.util.XmlNamespaceConstants.*;

@Data
@JacksonXmlRootElement(localName = "ManufacturerUl", namespace = tns)
public class ManufacturerUl {
    @JacksonXmlProperty(localName = "OrganForm", namespace = tns)
    private String organForm;

    @JacksonXmlProperty(localName = "FullName", namespace = tns)
    private String fullName;

    @JacksonXmlProperty(localName = "Address", namespace = tns)
    private Address address;

    @JacksonXmlProperty(localName = "AddressActual", namespace = tns)
    private String addressActual;

    @JacksonXmlProperty(localName = "Phone", namespace = tns)
    private String phone;

    @JacksonXmlProperty(localName = "Fax", namespace = tns)
    private String fax;

    @JacksonXmlProperty(localName = "Email", namespace = tns)
    private String email;

    @JacksonXmlProperty(localName = "Organ", namespace = tns)
    private String organ;

    @JacksonXmlProperty(localName = "Date", namespace = tns)
    private String date;

    @JacksonXmlProperty(localName = "Ogrn", namespace = tns)
    private String ogrn;

    @JacksonXmlProperty(localName = "Inn", namespace = tns)
    private String inn;
}