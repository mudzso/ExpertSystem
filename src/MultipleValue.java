/**
 * Created by Mudzso on 2017.02.07..
 */
public class MultipleValue extends Value{

    String param;
    String[] inputPattern;

    public MultipleValue(String param) {
        this.param = param;
        this.inputPattern = param.split(",");
    }

    public String[] getInputPattern() {
        return inputPattern;
    }
}
