package protected_accessmodifier;

import public_accessmodifier.ClassOfStudent;

public class Shape {
    // khai báo 1 phương thức protected
    private int sides;
    private String something;

    // tạo hàm tạo mặc định và khởi tạo sides = 3
    public Shape() {
        sides = 9999;
        something = "hello";
    }

    // tạo phương thức hienThi() được khai báo protected
    protected void hienThi() {
        System.out.println("Sides = " + sides);
    }
    protected void hienThi2() {
        System.out.println("Let's say " + something);
    }
    private void hienThi3() {
        System.out.println("Let's screaming " + something);
    }
}
class TestShape1 {
    public static void main(String[] args) {
        // khởi tạo 1 đối tượng Shape
        Shape shape1 = new Shape();
        shape1.hienThi2();
        //shape1.hienThi3(); //Error:(30, 15) java: hienThi3() has private access in protected_accessmodifier.Shape

        ClassOfStudent hocSinh = new ClassOfStudent();
        hocSinh.inputYourClass();
        hocSinh.showInformation();

        ClassOfStudent.Child child = new ClassOfStudent.Child();
        child.inputYourClassRetest();
    }
}