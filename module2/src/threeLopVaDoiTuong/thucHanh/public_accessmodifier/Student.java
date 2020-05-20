package threeLopVaDoiTuong.thucHanh.public_accessmodifier;

public class Student {
    public static void main(String[] args) {
        // Khởi tạo đối tượng của lớp ClassOfStudent
        ClassOfStudent classOfStudent111 = new ClassOfStudent();

        // truy cập phương thức inputYourClass() và showInformation() của lớp ClassOfStudent<br />
        classOfStudent111.inputYourClass();

        // hiển thị thông tin vừa nhập
        classOfStudent111.showInformation();
    }
}