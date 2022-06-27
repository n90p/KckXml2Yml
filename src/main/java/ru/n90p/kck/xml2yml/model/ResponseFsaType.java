package ru.n90p.kck.xml2yml.model;

import lombok.*;
import com.fasterxml.jackson.dataformat.xml.annotation.*;

import static ru.n90p.kck.xml2yml.util.XmlNamespaceConstants.*;

@Data
@JacksonXmlRootElement(localName = "ResponseFsaType", namespace = fsa)
public class ResponseFsaType {
    @JacksonXmlProperty(localName = "RdcTr", namespace = fsa)
    private RdcTr rdcTr;
}