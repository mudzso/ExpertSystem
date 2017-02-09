import java.util.LinkedHashMap;
import java.util.Map;
/**
 * Created by Mudzso on 2017.02.07..
 */
public class FactRepository {

    private Iterator iterator;
    private Map<String,Fact> facts = new LinkedHashMap<>();

    public FactRepository() {

        class FactIterator implements Iterator {

            int index = 0;


            public boolean hasNext() {

                return index < facts.size();
            }

            public Object next() {

                Fact result = facts.get(index);
                index++;
                return result;
            }
        }
        this.iterator = new FactIterator();
    }

    public Iterator getIterator() {

        return iterator;
    }

    public void addFact(String id,Fact fact) {

        facts.put(id,fact);
    }



}
