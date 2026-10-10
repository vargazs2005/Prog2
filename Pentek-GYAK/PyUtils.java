import java.util.ArrayList;
import java.util.List;

public class PyUtils {
    private PyUtils() {
        //Nem példányosítható.
    }

    static List<Integer> range(int lo, int hi, int step) {
        List<Integer> result = new ArrayList<>(); // Int lista létrehozása
        for (int i=lo; i<hi; i+=step) {
            result.add(i);
        }
        return result;
    }

    static List<Integer> range(int lo, int hi) {
        return range(lo, hi, 1);
    }

    static List<Integer> range(int hi) {
        return range(0, hi);             //v1
        //return range(0, hi, 1);             v2
    }
}
