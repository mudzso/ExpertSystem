/**
 * Created by Mudzso on 2017.02.07..
 */
public class SingleValue extends Value{

    String param;
    String[] inputPattern;

    public SingleValue(String param, boolean bool) {
        this.param = param;
        this.inputPattern = new String[1];
        this.inputPattern[0] = param;
        this.bool = bool;
    }

    public String[] getInputPattern() {
        return inputPattern;
    }
}
