package point2DPoint3D;

import java.util.Scanner;

public class Point3D extends Point2D {
    private float z = 0;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z){
        super.x = x;
        super.y = y;
        this.z = z;
    }

    public float[] getXYZ(){
        float[] xyz = new float[3];
        xyz[0] = this.x;
        xyz[1] = this.y;
        xyz[2] = this.z;
        return xyz;
    }

    @Override
    public String toString(){
        return "Point 3D has X = " + this.x + ", Y = " + this.y + ", Z = " + this.z;
    }
    @Override
    public void input(){
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Z: ");
        this.z = scanner.nextFloat();
    }
}
