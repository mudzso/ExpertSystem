import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Created by Mudzso on 2017.02.07..
 */
public class RuleParser extends XmlParser {

    public RuleRepository getRuleRepository() {
            loadXmlDocument("/home/Mudzso/Java/ExpertSystem/Xmls/Rule.xml");
            NodeList nList = doc.getElementsByTagName("Rule");
            RuleRepository ruleRepository = new RuleRepository();
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    String id = eElement.getAttribute("id");

                    Question question = new Question(eElement

                            .getElementsByTagName("Question")
                            .item(0)
                            .getTextContent());
                     Node n = eElement.getElementsByTagName("Answer").item(0);
                    boolean isMulti = false;
                    Node selection=((Element)n).getElementsByTagName("Selection").item(0);
                    Element e = (Element)selection;
                    Answer answer = new Answer();
                    String trueValue,falseValue;
                    if(e.getElementsByTagName("MultipleValue").getLength() != 0){
                        trueValue = e.getElementsByTagName("MultipleValue").item(0).getAttributes()
                                .getNamedItem("value").getNodeValue();
                        isMulti = true;



                    }else{

                        trueValue = e.getElementsByTagName("SingleValue").item(0).getAttributes()
                                .getNamedItem("value").getNodeValue();

                    }

                    selection=((Element)n).getElementsByTagName("Selection").item(1);
                    e = (Element)selection;

                    if(e.getElementsByTagName("MultipleValue").getLength() != 0){
                        falseValue = e.getElementsByTagName("MultipleValue").item(0).getAttributes()
                                .getNamedItem("value").getNodeValue();






                    }else{

                        falseValue = e.getElementsByTagName("SingleValue").item(0).getAttributes()
                                .getNamedItem("value").getNodeValue();

                    }
                    if(isMulti){
                        answer.addValue(new MultipleValue(trueValue,true));
                        answer.addValue(new MultipleValue(falseValue,false));
                    }else{
                        answer.addValue(new SingleValue(trueValue,true));
                        answer.addValue(new SingleValue(falseValue,false));
                    }

                    question.setAnswerEvaluater(answer);
                    ruleRepository.addQuestion(id,question);
                }
            }

        return ruleRepository;
    }
}
