import java.util.*;

/**
 * Created by Mudzso on 2017.02.07..
 */
public class RuleRepository {

    private Iterator iterator;

    private Map<String, Question> questions = new LinkedHashMap<>();

    public RuleRepository() {

        class QuestionIterator implements Iterator {

            int index = 0;


            public boolean hasNext() {

                return index < questions.size();
            }

            public Object next() {

                Question result = questions.get(index);
                index++;
                return result;

            }
        }
        this.iterator = new QuestionIterator();
    }


    public Question addQuestion(String id, Question question) {

        questions.put(id, question);
        return question;
    }

    public Map<String, Question> getQuestions() {
        return questions;
    }

    public Iterator getIterator() {
        return iterator;
    }
}






