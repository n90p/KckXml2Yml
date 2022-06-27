package ru.n90p.kck.xml2yml.test;

import java.io.*;

import ru.n90p.kck.xml2yml.*;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {
    @Test
    public void test() throws Exception {
        File input = new File("sample.xml");
        File output = new File("output.yml");

        Main.main(input.getPath(), output.getPath());

        assertTrue(output.exists());
    }
}