import java.util.Scanner;

public class TinhLaiNganHang {
    public static void main(String[] args){
        /*Trong phần này, chúng ta sẽ xây dựng một ứng dụng cho phép tính tiền cho vay lãi của một ngân hàng.
        Ứng dụng cho phép nhập vào 3 tham số: số lượng tiền cho vay, tỉ lệ lãi suất theo tháng, số tháng cho vay.
        Ứng dụng sẽ hiển thị tổng số tiền có được khi hết thời hạn cho vay.
        Cách tính tiền lãi:
        Tiền gửi có kỳ hạn là loại tiền gửi tiết kiệm chỉ có thể rút ra sau một khoảng thời gian nhất định người gửi tiền
        đã cam kết với ngân hàng. Bên ngân hàng sẽ đưa ra nhiều mức kỳ hạn khác nhau để khách hàng có thể chọn lựa theo tuần, tháng, quý, năm.
        Công thức:
        Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi*/
        double money;
        double interestRate;
        int numberOfMonth;
        Scanner input = new Scanner(System.in);
        System.out.println("Input amount of money: ");
        money = input.nextDouble()t();
        System.out.println("Interest per YEAR (%): ");
        interestRate = input.nextDouble();
        System.out.println("Number of month: ");
        numberOfMonth = input.nextInt();
        double interest = money * (interestRate/12/100) * numberOfMonth;
        System.out.println("Your interest of "+numberOfMonth+" month(s) is "+interest);
    }
}
