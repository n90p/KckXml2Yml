package ru.n90p.kck.xml2yml.model.product;

import lombok.*;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import ru.n90p.kck.xml2yml.annotation.*;

import static ru.n90p.kck.xml2yml.util.XmlNamespaceConstants.*;

@Data
@JacksonXmlRootElement(localName = "Product", namespace = tns)
public class Product {
    @JacksonXmlProperty(localName = "DeclareType", namespace = tns)
    private String declareType;

    @JacksonXmlProperty(localName = "DcOriginType", namespace = tns)
    private String dcOriginType;

    @JacksonXmlProperty(localName = "Name", namespace = tns)
    private String name;

    @JacksonXmlProperty(localName = "ProductInfo", namespace = tns)
    private String productInfo;

    @JacksonXmlProperty(localName = "Okp", namespace = tns)
    private String okp;

    @JacksonXmlProperty(localName = "OkpdText", namespace = tns)
    private String okpdText;

    @JacksonXmlProperty(localName = "Standart", namespace = tns)
    private String standart;

    @JacksonXmlProperty(localName = "SizeNumber", namespace = tns)
    private String sizeNumber;

    @JacksonXmlProperty(localName = "DetailsShippingDocumentation", namespace = tns)
    private String detailsShippingDocumentation;

    @JacksonXmlProperty(localName = "ContractInfo", namespace = tns)
    private String contractInfo;

    @JacksonXmlProperty(localName = "Info", namespace = tns)
    private String info;

    @JacksonXmlProperty(localName = "PlaceMark", namespace = tns)
    private String placeMark;

    @YamlWriteIgnore
    @JacksonXmlProperty(localName = "TechRegs", namespace = tns)
    private TechRegs techRegs;
}