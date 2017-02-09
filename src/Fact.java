import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/**
 * Created by Mudzso on 2017.02.07..
 */
public class Fact {

    String description;
    Map<String,Boolean> evals;

    Fact(String description) {

        this.description = description;
        this.evals = new HashMap<String,Boolean>();
    }

    public void setFactValueByID(String id, boolean value) {

        evals.put(id,value);

    }

    public Set<String> getIDSet() {

        return evals.keySet();
    }

    public boolean getValueByID(String input) {


        return  evals.get(input);
    }

    public String getDescription() {
        return description;
    }
}
