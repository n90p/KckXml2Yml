package ru.n90p.kck.xml2yml.test;

import java.io.*;

import org.junit.jupiter.api.*;
import ru.n90p.kck.xml2yml.model.*;
import ru.n90p.kck.xml2yml.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {
    @Test
    public void test() throws Exception {
        File inputFile = new File("sample.xml");
        File outputFile = new File("output.yml");

        convertXmlToYml(inputFile, outputFile);

        assertTrue(outputFile.exists());
    }

    private void convertXmlToYml(File inputXml, File outputYml) throws IOException {
        FileUtils fileUtils = new FileUtils();

        ResponseFsaType resp = fileUtils.readFromXmlFile(inputXml, ResponseFsaType.class);
        fileUtils.writeAsYmlToFile(outputYml, resp);
    }
}