import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(4,5);
        System.out.println("p.hashCode() before translation: " + p.hashCode());

        Set<Point> set = new HashSet<Point>();
        set.add(p); // add point p to set
        System.out.println("Set contains new Point(4,5): " + set.contains(new Point(4,5)));   // true

        p.translate(2,2);   // translates point p to (6,7)
        System.out.println("p.hashCode() after translation: " + p.hashCode());

        System.out.println("new Point(6,7).hashCode(): " + (new Point(6,7)).hashCode());
        System.out.println("Set contains new Point(6,7): " + set.contains(new Point(6,7)));   // false
    }
}