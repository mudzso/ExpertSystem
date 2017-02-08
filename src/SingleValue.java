/**
 * Created by Mudzso on 2017.02.07..
 */
public class SingleValue extends Value{

    String param;
    String[] inputPattern = new String[1];

    public SingleValue(String param) {
        this.param = param;
        this.inputPattern[0] = param;
    }

    public String[] getInputPattern() {
        return inputPattern;
    }
}
