package ru.n90p.kck.xml2yml.util;

import java.io.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.xml.*;
import com.fasterxml.jackson.dataformat.yaml.*;
import ru.n90p.kck.xml2yml.annotation.*;
import ru.n90p.kck.xml2yml.jackson.*;

public class FileParser {
    public <T> T readFromXmlFile(File xmlFile, Class<T> type) throws IOException {
        try (Reader reader = new FileReader(xmlFile)) {
            ObjectMapper xmlMapper = new XmlMapper();
            return xmlMapper.readValue(reader, type);
        }
    }

    public void writeAsYmlToFile(File ymlFile, Object root) throws IOException {
        try (Writer writer = new FileWriter(ymlFile)) {
            YAMLFactory yamlFactory = new YAMLFactory();
            yamlFactory.disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER);

            ObjectMapper mapper = new ObjectMapper(yamlFactory);
            mapper.setAnnotationIntrospector(new JacksonAnnotationIgnoringIntrospector(YamlWriteIgnore.class));

            SequenceWriter sw = mapper.writerWithDefaultPrettyPrinter().writeValues(writer);
            sw.write(root);
        }
    }
}