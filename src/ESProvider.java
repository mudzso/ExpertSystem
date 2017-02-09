/**
 * Created by Mudzso on 2017.02.07..
 */
public class ESProvider {

    FactParser factParser;
    RuleParser ruleParser;
    FactRepository factRepository;
    RuleRepository ruleRepository;

    public ESProvider(FactParser factParser, RuleParser ruleParser) {
        this.factParser = factParser;
        this.ruleParser = ruleParser;
        factRepository = factParser.getFactRepository();
        ruleRepository = ruleParser.getRuleRepository();
    }

    public void collectAnswers() {

    }

    public boolean getAnswerByQuestion(String questionID) {
        return false;
    }

    public String evaluate() {
        return "";
    }
}
