import java.util.ArrayList;
import java.util.List;

public class PyUtils {

    public static List<Integer> range(int start, int end, int step) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = start; i < end; i += step) {
            result.add(i);
        }
        
        return result;
    }

    public static List<Integer> range(int start, int end) {
        return range(start, end, 1);
    }

    public static List<Integer> range(int end) {
        return range(0, end, 1);
    }


    public static void main(String[] args) {
        System.out.println("Két paraméteres hívások:");
        System.out.println(PyUtils.range(0, 5));
        System.out.println(PyUtils.range(3, 7));
        System.out.println(PyUtils.range(3, 4));
        System.out.println(PyUtils.range(3, 3));

        System.out.println("\nEgy paraméteres hívások:");
        System.out.println(PyUtils.range(10));
        System.out.println(PyUtils.range(1));
        System.out.println(PyUtils.range(0));
        System.out.println(PyUtils.range(-4));

        System.out.println("\nHárom paraméteres hívások:");
        System.out.println(PyUtils.range(4, 20, 2));
        System.out.println(PyUtils.range(4, 10, 1));
        System.out.println(PyUtils.range(10, 4, 1));
    }
}