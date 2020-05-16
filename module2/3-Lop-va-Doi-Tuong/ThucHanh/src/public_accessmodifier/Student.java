package public_accessmodifier;

public class Student {
    public static void main(String[] args) {
        // Khởi tạo đối tượng của lớp ClassOfStudent
        public_accessmodifier.ClassOfStudent classOfStudent111 = new public_accessmodifier.ClassOfStudent();

        // truy cập phương thức inputYourClass() và showInformation() của lớp ClassOfStudent<br />
        classOfStudent111.inputYourClass();

        // hiển thị thông tin vừa nhập
        classOfStudent111.showInformation();
    }
}