import org.w3c.dom.Document;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by Mudzso on 2017.02.07..
 */
public class XmlParser {

    public boolean validateXml(String fullpathXml,String fullpathXsd){

        try
        {

            InputStream xml = new FileInputStream(fullpathXml);
            InputStream xsd = new FileInputStream(fullpathXsd);

            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new StreamSource(xsd));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(xml));
            return true;

        }
        catch(Exception e){
            return false;

        }
    }

    public void  loadXmlDocument(String fullpath){
        try{
        File input = new File(fullpath);
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document doc = documentBuilder.parse(input);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
