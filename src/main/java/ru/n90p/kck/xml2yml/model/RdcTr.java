package ru.n90p.kck.xml2yml.model;

import lombok.*;

import com.fasterxml.jackson.dataformat.xml.annotation.*;

import ru.n90p.kck.xml2yml.model.applicant.*;
import ru.n90p.kck.xml2yml.model.certificationorgan.*;
import ru.n90p.kck.xml2yml.model.manufacturer.*;
import ru.n90p.kck.xml2yml.model.product.*;
import ru.n90p.kck.xml2yml.model.requisites.*;

import static ru.n90p.kck.xml2yml.util.XmlNamespaceConstants.*;

@Data
@JacksonXmlRootElement(localName = "RdcTr", namespace = fsa)
public class RdcTr {
    @JacksonXmlProperty(localName = "Type", namespace = tns)
    private String type;

    @JacksonXmlProperty(localName = "Requisites", namespace = tns)
    private Requisites requisites;

    @JacksonXmlProperty(localName = "Applicant", namespace = tns)
    private Applicant applicant;

    @JacksonXmlProperty(localName = "ApplicantUl", namespace = tns)
    private ApplicantUl applicantUl;

    @JacksonXmlProperty(localName = "ApplicantFl", namespace = tns)
    private String applicantFl;

    @JacksonXmlProperty(localName = "ApplicantAl", namespace = tns)
    private String ApplicantAl;

    @JacksonXmlProperty(localName = "ApplicantAu", namespace = tns)
    private String ApplicantAu;

    @JacksonXmlProperty(localName = "Manufacturer", namespace = tns)
    private Manufacturer manufacturer;

    @JacksonXmlProperty(localName = "Product", namespace = tns)
    private Product product;

    @JacksonXmlProperty(localName = "DeclareAddInfo", namespace = tns)
    private String declareAddInfo;

    @JacksonXmlProperty(localName = "CertificationOrgan", namespace = tns)
    private CertificationOrgan certificationOrgan;
}