package ru.n90p.kck.xml2yml.util;

import java.io.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.xml.*;
import com.fasterxml.jackson.dataformat.yaml.*;
import ru.n90p.kck.xml2yml.annotation.*;
import ru.n90p.kck.xml2yml.jackson.*;

public class FileParser {
    public <T> T readAsXml(File xmlFile, Class<T> type) throws IOException {
        try (Reader reader = new FileReader(xmlFile)) {
            return readAsXml(reader, type);
        }
    }

    public <T> T readAsXml(Reader reader, Class<T> type) throws IOException {
        ObjectMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(reader, type);
    }

    public void writeAsYml(File ymlFile, Object root) throws IOException {
        try (Writer writer = new FileWriter(ymlFile)) {
            writeAsYml(writer, root);
        }
    }

    public void writeAsYml(Writer writer, Object root) throws IOException {
        YAMLFactory yamlFactory = YAMLFactory.builder()
                .enable(YAMLGenerator.Feature.MINIMIZE_QUOTES)
                .disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER)
                .disable(YAMLGenerator.Feature.SPLIT_LINES)
                .build();

        ObjectMapper mapper = new ObjectMapper(yamlFactory);
        mapper.setAnnotationIntrospector(new JacksonAnnotationIgnoringIntrospector(YamlIgnore.class));

        SequenceWriter sw = mapper.writerWithDefaultPrettyPrinter().writeValues(writer);
        sw.write(root);
    }
}