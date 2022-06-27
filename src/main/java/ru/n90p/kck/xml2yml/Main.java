package ru.n90p.kck.xml2yml;

import java.io.*;

import ru.n90p.kck.xml2yml.model.*;
import ru.n90p.kck.xml2yml.util.*;

public final class Main {
    public static void main(String... args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java -jar xml2yml.jar [input] [output]");
            return;
        }

        File inputFile = new File(args[0]);
        File outputFile = new File(args[1]);

        convertFile(inputFile, outputFile);
    }

    private static void convertFile(File inputFile, File outputFile) throws IOException {
        FileParser parser = new FileParser();

        ResponseFsaType resp = parser.readFromXmlFile(inputFile, ResponseFsaType.class);
        parser.writeAsYmlToFile(outputFile, resp);
    }
}