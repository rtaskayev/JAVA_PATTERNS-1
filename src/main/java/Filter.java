import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected int treshold;
    Logger logger = Logger.getInstance();

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < source.size(); i++) {
            int x = source.get(i);
            if (x >= treshold) {
                logger.log("Элемент \"" + x + "\" проходит");
                result.add(x);
            } else logger.log("Элемент \"" + x + "\" не проходит");
        }
        return result;
    }
}