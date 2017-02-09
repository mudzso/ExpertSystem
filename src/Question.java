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
        this.answer = null;
    }

    public String getQuestion() {
        return question;
    }

    public void setAnswerEvaluater(Answer answer) {
            this.answer = new Answer();
    }

    public boolean getEvaluatedAnswer(String input) {
        boolean result = false;
        if(answer.evaluateAnswerByInput(input)){
            for (Map.Entry<Boolean, Value> entry : answer.getValues().entrySet()) {
                if (Objects.equals(input, entry.getValue())) {
                    result = entry.getKey();
                }
            }

        }
        return result;
    }
}
