import java.util.*;

/**
 * Created by Mudzso on 2017.02.07..
 */
public class RuleRepository {

    private Iterator iterator;

    private Map<String, Question> questions = new LinkedHashMap<>();


    public Question addQuestion(String id, Question question) {

        questions.put(id, question);
        return question;
    }

    public Map<String, Question> getQuestions() {
        return questions;
    }

    public Iterator getIterator() {
        return new QuestionIterator();
    }
    class QuestionIterator implements Iterator {
        java.util.Iterator it;

        public QuestionIterator() {
            super();
            this.it = questions.values().iterator();
        }

        @Override
        public boolean hasNext() {
            return it.hasNext();
        }

        @Override
        public Object next() {
            return it.next();
        }
    }
}







