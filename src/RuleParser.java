import org.w3c.dom.NodeList;

/**
 * Created by Mudzso on 2017.02.07..
 */
public class RuleParser extends XmlParser {

    public RuleRepository getRuleRepository() {
        if(validateXml(
                "/home/Mudzso/Java/ExpertSystem/Xmls/Rule.xml",
                "/home/Mudzso/Java/ExpertSystem/Xmls/rules.xsd")){
            loadXmlDocument("/home/Mudzso/Java/ExpertSystem/Xmls/Rule.xml");
            NodeList nList = doc.getElementsByTagName("Rule");
            for (int temp = 0; temp < nList.getLength(); temp++) {



            }


        }

        return null;
    }
}
