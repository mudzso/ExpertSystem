import java.util.LinkedHashMap;
import java.util.Map;
/**
 * Created by Mudzso on 2017.02.07..
 */
public class FactRepository {

    private Map<String,Question> facts = new LinkedHashMap<>();

    public Iterator getIterator() {
        return null;
    }

    public void addFact(Fact fact) {

    }


    class FactIterator {

        int index = 0;


        public boolean hasNext() {

            return index < facts.size();
        }

        public Object next() {

            Question result = facts.get(index);
            index++;
            return result;
        }
    }
}
