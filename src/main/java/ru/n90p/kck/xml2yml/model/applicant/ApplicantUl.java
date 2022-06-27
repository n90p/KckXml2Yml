package ru.n90p.kck.xml2yml.model.applicant;

import lombok.*;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import ru.n90p.kck.xml2yml.model.Address;

import static ru.n90p.kck.xml2yml.XmlNamespaceConstants.*;

@Data
@JacksonXmlRootElement(localName = "ApplicantUl", namespace = tns)
public class ApplicantUl {
    @JacksonXmlProperty(localName = "OrganForm", namespace = tns)
    private String organForm;
    @JacksonXmlProperty(localName = "FullName", namespace = tns)
    private String fullName;
    @JacksonXmlProperty(localName = "ShortName", namespace = tns)
    private String shortName;
    @JacksonXmlProperty(localName = "Head", namespace = tns)
    private String head;
    @JacksonXmlProperty(localName = "HeadPost", namespace = tns)
    private String headPost;
    @JacksonXmlProperty(localName = "HeadText", namespace = tns)
    private String headText;
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
    @JacksonXmlProperty(localName = "RegInfo", namespace = tns)
    private String regInfo;
    @JacksonXmlProperty(localName = "Contract", namespace = tns)
    private String contract;
}