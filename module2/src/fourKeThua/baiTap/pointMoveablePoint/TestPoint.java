package fourKeThua.baiTap.pointMoveablePoint;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(66,99);
        //System.out.println(point.toString());

        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.setSpeed(20,30);
        System.out.println(Arrays.toString(moveablePoint.getXY()));
        System.out.println(moveablePoint.move());
        System.out.println(Arrays.toString(moveablePoint.getXY()));
        ;
        System.out.println(moveablePoint.move());
        System.out.println(Arrays.toString(moveablePoint.getXY()));
    }
}
