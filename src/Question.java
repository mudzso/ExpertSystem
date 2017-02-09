import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Mudzso on 2017.02.07..
 */
public class Question {

    String question;
    Answer answer;

    public Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setAnswerEvaluater(Answer answer) {
            this.answer = answer;
    }

    public boolean getEvaluatedAnswer(String input) {
            for (Map.Entry<Boolean, Value> entry : answer.getValues().entrySet()) {
                if (Arrays.asList(entry.getValue().getInputPattern()).contains(input)) {
                    return entry.getValue().getBool();
                }
            }

        return false;
    }

}
