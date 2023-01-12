package point;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(4.5f);
        point.setY(7.7f);
        System.out.println(point);

        point.setX(6.6f);
        point.setY(3.2f);
        System.out.println(point);
    }
}
