/**
 * Created by Mudzso on 2017.02.07..
 */
public class MultipleValue extends Value{

    String param;
    String[] inputPattern;
    boolean bool;

    public MultipleValue(String param, boolean bool) {
        this.param = param;
        this.inputPattern = param.split(",");
        this.bool = bool;
    }

    public String[] getInputPattern() {
        return inputPattern;
    }
}
