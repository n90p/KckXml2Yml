package ru.n90p.kck.xml2yml.model.applicant;

import lombok.*;
import com.fasterxml.jackson.dataformat.xml.annotation.*;

import static ru.n90p.kck.xml2yml.util.XmlNamespaceConstants.*;

@Data
@JacksonXmlRootElement(localName = "Applicant", namespace = tns)
public class Applicant {
    @JacksonXmlProperty(localName = "ApplicantType", namespace = tns)
    private String applicantType;

    @JacksonXmlProperty(localName = "DeclarantType", namespace = tns)
    private String declarantType;
}