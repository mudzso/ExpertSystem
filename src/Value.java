/**
 * Created by Mudzso on 2017.02.07..
 */
public abstract class Value {

    boolean bool;
    public abstract String[] getInputPattern();

    public void setBool(boolean parserInput) {
        if (parserInput) {
            this.bool = true;
        } else {
            this.bool = false;
        }
    }

    public boolean getBool() {
        return bool;
    }
}
