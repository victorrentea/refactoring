package bscc.creation;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

abstract class BaseCsvWriter {
    public static BaseCsvWriter createCsvWriter(String s, int expectedNoLines) throws ParserConfigurationException {
        // Static Factory Method  aka "Factory Method"
        // alte utilizari: cand implementarile concrete (subtipurile) se gasesc in JAR-uri diferite.
        // alegi implementarea efectiva intoarsa in fct de ce JAR-uri ai in classpath:
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        DocumentBuilder db = dbf.newDocumentBuilder(); // factory method de instanta

        if (expectedNoLines < 1000) {
            return new CsvWriterInMemory();
        } else {
            return new CsvWriterDiskBased();
        }
    }
}
class CsvWriterInMemory extends BaseCsvWriter {
}
class CsvWriterDiskBased extends BaseCsvWriter {
}

class Client {
    public static void main(String[] args) throws ParserConfigurationException {

        BaseCsvWriter.createCsvWriter("file.csv", 100);
        BaseCsvWriter.createCsvWriter("file.csv", 10_000);
    }
}


