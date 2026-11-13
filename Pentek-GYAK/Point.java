package masodikZH.nov13.Point;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    @Override
//    public String toString() {
//        return "Point(x="+this.x+", y="+this.y+")";
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (this == obj) {
//            return true;
//        }
//        if (!(obj instanceof Point)) {
//            return false;
//        } else {
//            Point other = (Point) obj;
//            return this.x == other.x && this.y == other.y;
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
