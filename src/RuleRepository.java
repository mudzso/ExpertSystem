import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Mudzso on 2017.02.07..
 */
public class RuleRepository {

    private Map<String,Question> questions = new LinkedHashMap<>();

    public Question addQuestion(String id, Question question){

        questions.put(id,question);
        return question;
    }

    public Iterator getIterator() {
        return null;
    }


    class QestionIterator{

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
}

