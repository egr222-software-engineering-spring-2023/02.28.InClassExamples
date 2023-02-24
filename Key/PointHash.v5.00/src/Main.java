import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(4,5);
        Set<Point> set = new HashSet<Point>();
        set.add(p);

        System.out.println(set.contains(new Point(4,5)));   //true
    }
}