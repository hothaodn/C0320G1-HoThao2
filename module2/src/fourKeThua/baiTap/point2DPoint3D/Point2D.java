import java.util.Scanner;

public class Point2D {
    protected float x = 0;
    protected float y = 0;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] xy = new float[2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }

    public String toString(){
        return "Point 2D has X = " + this.x + " and Y = " + this.y;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input X: ");
        this.x = scanner.nextFloat();
        System.out.println("Input Y: ");
        this.y = scanner.nextFloat();
    }
}