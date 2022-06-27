package ru.n90p.kck.xml2yml;

import lombok.*;

import java.io.*;
import java.lang.annotation.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.dataformat.xml.*;
import com.fasterxml.jackson.dataformat.yaml.*;

import ru.n90p.kck.xml2yml.model.*;
import ru.n90p.kck.xml2yml.annotation.*;

public final class Main {
    public static void main(String... args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java -jar xml2yml.jar [input] [output]");
            return;
        }

        File inputFile = new File(args[0]);
        File outputFile = new File(args[1]);

        ResponseFsaType resp = readFromXmlFile(inputFile);

        writeToYmlFile(outputFile, resp);
    }

    private static ResponseFsaType readFromXmlFile(File xmlFile) throws IOException {
        try (Reader reader = new FileReader(xmlFile)) {
            ObjectMapper xmlMapper = new XmlMapper();
            return xmlMapper.readValue(reader, ResponseFsaType.class);
        }
    }

    private static void writeToYmlFile(File ymlFile, ResponseFsaType root) throws IOException {
        try (FileWriter writer = new FileWriter(ymlFile)) {
            YAMLFactory yf = new YAMLFactory();
            yf.disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER);

            ObjectMapper mapper = new ObjectMapper(yf);
            mapper.setAnnotationIntrospector(new JacksonAnnotationIgnoringIntrospector(YamlWriteIgnore.class));

            SequenceWriter sw = mapper.writerWithDefaultPrettyPrinter().writeValues(writer);
            sw.write(root);
        }
    }

    @RequiredArgsConstructor
    static class JacksonAnnotationIgnoringIntrospector extends JacksonAnnotationIntrospector {
        private final Class<? extends Annotation> ignoredAnnotation;

        @Override
        protected boolean _isIgnorable(Annotated a) {
            return super._isIgnorable(a) || a.hasAnnotation(ignoredAnnotation);
        }
    }
}