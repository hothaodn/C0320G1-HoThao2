public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setFilled(true);
        System.out.println(shape.toString());

        Circle circle = new Circle();
        circle.setRadius(100);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getPerimeter());

        Square square = new Square("pink",true,9);
        System.out.println(square.getArea());
        System.out.println(square.toString());
    }
}
