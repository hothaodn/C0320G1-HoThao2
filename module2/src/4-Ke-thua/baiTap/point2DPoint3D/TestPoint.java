import java.sql.SQLOutput;
import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        //test 1
        Point2D point2d = new Point2D();
        point2d.setXY(6,9);
        System.out.println(Arrays.toString(point2d.getXY()));
        System.out.println(point2d.toString());
        //test 2
        Point2D point2D_2 = new Point2D();
        point2D_2.input();
        System.out.println(point2D_2.toString());
        //test 3
        Point3D point3d = new Point3D(7,8,9);
        //point3d.setXYZ(1,2,3);
        System.out.println(Arrays.toString(point3d.getXYZ()));
        System.out.println(point3d.toString());
        //test 4
        Point3D point3d_2 = new Point3D();
        point3d_2.input();
        System.out.println(point3d_2.toString());
    }
}
