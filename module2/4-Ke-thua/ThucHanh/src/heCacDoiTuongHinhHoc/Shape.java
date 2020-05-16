package heCacDoiTuongHinhHoc;

public class Shape {
    static String color = "red";
    static boolean filled = true;
    public Shape(){
    }
    private Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        return "A Shape with color of " + color + " and filled/not filled";
    }
}
