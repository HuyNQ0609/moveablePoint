package moveAblePoint;

import point.Point;

public class TestMoveAblePoint {
    public static void main(String[] args) {
        MoveAblePoint draw = new MoveAblePoint();
        draw.setXSpeed(draw.getX());
        draw.setYSpeed(draw.getY());
        draw.setXSpeed(3.3f);
        draw.setYSpeed(8.1f);
        draw.move();
        System.out.println(draw.move());
    }
}