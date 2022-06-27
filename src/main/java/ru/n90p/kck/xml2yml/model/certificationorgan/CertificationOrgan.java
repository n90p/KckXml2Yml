package ru.n90p.kck.xml2yml.model.certificationorgan;

import lombok.*;
import com.fasterxml.jackson.dataformat.xml.annotation.*;

import static ru.n90p.kck.xml2yml.XmlNamespaceConstants.*;

@Data
@JacksonXmlRootElement(localName = "CertificationOrgan", namespace = tns)
public class CertificationOrgan {
    @JacksonXmlProperty(localName = "FullName", namespace = tns)
    private String fullName;
    @JacksonXmlProperty(localName = "Number", namespace = tns)
    private String mumber;
    @JacksonXmlProperty(localName = "DateReg", namespace = tns)
    private String dateReg;
    @JacksonXmlProperty(localName = "Organ", namespace = tns)
    private String organ;
    @JacksonXmlProperty(localName = "Head", namespace = tns)
    private String head;
    @JacksonXmlProperty(localName = "AddressLegal", namespace = tns)
    private String addressLegal;
    @JacksonXmlProperty(localName = "Address", namespace = tns)
    private String address;
    @JacksonXmlProperty(localName = "Phone", namespace = tns)
    private String phone;
    @JacksonXmlProperty(localName = "Fax", namespace = tns)
    private String fax;
    @JacksonXmlProperty(localName = "Email", namespace = tns)
    private String email;
    @JacksonXmlProperty(localName = "Ogrn", namespace = tns)
    private String ogrn;
    @JacksonXmlProperty(localName = "Experts", namespace = tns)
    private Experts experts;
}