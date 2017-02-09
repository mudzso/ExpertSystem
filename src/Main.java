import java.util.*;

/**
 * Created by Mudzso on 2017.02.07..
 */
public class Main {

    public static void main(String[] args) {


        /*RuleParser xmlParser = new RuleParser();
        RuleRepository rule = xmlParser.getRuleRepository();
        System.out.println(rule.getQuestions().get("fun").answer.getValues().get(true).getInputPattern()[0]);
*/
        FactParser factParser = new FactParser();
        FactRepository fact = factParser.getFactRepository();

        System.out.println(fact.facts.values().size());
        System.out.println(fact.getIterator().next());


    }
}
