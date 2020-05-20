public class Square extends Rectangle {
    double side;
    public Square(){
    }

    public Square( double side){
        this.side = side;
    }

    public Square(String color,boolean filled, double side){
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString(){
        return "A Square with width= " +this.length+ " which is a subclass of " + super.toString();
    }
}