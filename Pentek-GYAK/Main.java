package masodikZH.nov13.Point;

public class Main {
    static void main(String[] args) {
        Point p1 = new Point(2, 5);
        Point p2 = new Point(2, 5);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2)); // true

        String s = "hack";
        System.out.println(p1.equals(s)); // false

        System.out.println(p1.equals(p1)); // true

    }


}
