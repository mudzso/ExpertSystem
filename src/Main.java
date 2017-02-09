import java.util.*;

/**
 * Created by Mudzso on 2017.02.07..
 */
public class Main {

    public static void main(String[] args) {

       XmlParser xmlParser = new XmlParser();
       System.out.println(xmlParser.validateXml(
               "/home/Mudzso/Java/ExpertSystem/Xmls/Fact.xml",
               "/home/Mudzso/Java/ExpertSystem/Xmls/facts.xsd"
       )
       );

    }
}
