import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Mudzso on 2017.02.07..
 */
public class ESProvider {

    FactParser factParser;
    RuleParser ruleParser;
    RuleRepository rule;
    FactRepository fact;
    ArrayList<Boolean> answers;

    public ESProvider(FactParser factParser, RuleParser ruleParser) {
        this.factParser = factParser;
        this.ruleParser = ruleParser;
        rule = ruleParser.getRuleRepository();
        fact = factParser.getFactRepository();
    }

    public void collectAnswers() {


        answers = new ArrayList<>();
        String inputAnswer;
        for (Map.Entry<String, Question> entry : rule.getQuestions().entrySet()) {
            System.out.println(entry.getValue().getQuestion());
            do {
                Scanner input = new Scanner(System.in);
                inputAnswer = input.nextLine();

            }while (!(entry.getValue().answer.evaluateAnswerByInput(inputAnswer)));

            answers.add(entry.getValue().getEvaluatedAnswer(inputAnswer));
        }
    }

    public boolean getAnswerByQuestion(String questionID) {

        for (Map.Entry<String, Question> entry: rule.getQuestions().entrySet()) {
            if (entry.getKey().equals(questionID)){
                return true;
            }
        }
        return false;
    }

    public String evaluate() {

        if(!(answers.contains(false))){
                return "Good codecool material";
            };
        return "Bad coodecool material";
    }







    }

