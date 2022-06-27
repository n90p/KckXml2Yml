package ru.n90p.kck.xml2yml.test;

import java.io.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import ru.n90p.kck.xml2yml.model.*;
import ru.n90p.kck.xml2yml.util.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class YamlResultContentsTest {
    private String resultContent;

    @BeforeAll
    public void beforeAll() throws IOException {
        FileParser parser = new FileParser();
        ResponseFsaType root = parser.readAsXml(new File("sample.xml"), ResponseFsaType.class);

        CharArrayWriter writer = new CharArrayWriter();
        parser.writeAsYml(writer, root);

        resultContent = writer.toString();
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "Закрытое акционерное общество",
            "TabakRU@mail.ru",
            "Медведев",
            "Росаккредитация"
    })
    public void test_resultContainsWords(String word) {
        assertStringContains(resultContent, word);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "techRegs",
            "Технический регламент на табачную продукцию (Федеральный Закон № 268-ФЗ от 22 декабря 2008г.)"
    })
    public void test_resultNotContainsWords(String word) {
        assertStringNotContains(resultContent, word);
    }

    private void assertStringContains(String str, String co) {
        assertTrue(str.contains(co));
    }

    private void assertStringNotContains(String str, String co) {
        assertFalse(str.contains(co));
    }
}