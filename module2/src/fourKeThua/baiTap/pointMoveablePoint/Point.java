package fourKeThua.baiTap.pointMoveablePoint;

public class Point {
    protected float x = 0;
    protected float y = 0;

    public Point() {
    }

    public Point(float x, float y) {
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

    public float[] getXY() {
        float[] xy = new float[2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "X = " + this.x + " and Y = " + this.y;
    }
}
