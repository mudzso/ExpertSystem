import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Created by Mudzso on 2017.02.07..
 */
public class FactParser extends XmlParser{

    public FactRepository getFactRepository() {

        String id,description,evalid;
        boolean value;
        Fact fact;

        loadXmlDocument("/home/Mudzso/Java/ExpertSystem/Xmls/Fact.xml");
        NodeList nList = doc.getElementsByTagName("Fact");
        FactRepository factRepository = new FactRepository();
        for (int temp = 0; temp < nList.getLength() ; temp++) {




            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                id = eElement.getAttribute("id");
                description = eElement.getElementsByTagName("Description").item(0).getAttributes().getNamedItem("value").getNodeValue();
                fact = new Fact(description);
                NodeList evals = eElement.getElementsByTagName("Eval");
                for (int i = 0; i < evals.getLength() ; i++) {
                    Node mNode = evals.item(i);
                    if(mNode.getNodeType() == Node.ELEMENT_NODE){
                        Element eval = (Element)mNode;
                        String evalId = eval.getAttribute("id");
                        value = Boolean.parseBoolean(eval.getTextContent().trim());

                        fact.setFactValueByID(evalId,value);
                    }
                }
                factRepository.addFact(id,fact);
            }

        }


        return factRepository;
    }
}
