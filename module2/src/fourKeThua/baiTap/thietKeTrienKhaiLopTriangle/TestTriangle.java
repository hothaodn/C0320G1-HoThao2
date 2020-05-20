package fourKeThua.baiTap.thietKeTrienKhaiLopTriangle;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.getColor());
        System.out.println(triangle.toString());

        Triangle tamGiac = new Triangle();
        tamGiac.input();
        System.out.println(tamGiac.toString());

        Triangle tamGiac2 = new Triangle(1,2,3);
        System.out.println(tamGiac2.toString());;
    }
}
