import java.util.*;

/**
 * Created by Mudzso on 2017.02.07..
 */
public class FactRepository {

    private Iterator iterator;
    Map<String,Fact> facts;
    List<Fact> listFact;

    public FactRepository() {
        this.facts = new HashMap<>();
    }

    public Iterator getIterator() {
        return new FactIterator();
    }

    public void addFact(String id,Fact fact) {

        facts.put(id,fact);
    }


    class FactIterator implements Iterator {

        java.util.Iterator it;
        public FactIterator() {

            super();
            this.it = facts.values().iterator();
        }

        @Override
        public boolean hasNext() {
            return it.hasNext();
        }

        @Override
        public Object next() {
            return it.next();
        }


        /*int index = 0;


        public boolean hasNext() {
            return index < listFact.size();
        }

        public Fact next() {
            List<Fact>listFact = new ArrayList<>(facts.values());

            if(hasNext()) {
                Fact fact =  listFact.get(index);
                index++;
                return fact;
            }
            return null;
        }*/
    }

}
