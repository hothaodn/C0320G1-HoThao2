import java.util.Scanner;

public class ChuyenDoiNhietDo {
    /*Trong phần này, chúng ta sẽ phát triển một ứng dụng cho phép chuyển đổi nhiệt độ từ độ C sang độ F và ngược lại.
    Ứng dụng gồm một menu cho phép người dùng lựa chọn việc chuyển đổi nhiệt độ như sau:
    Menu
    1. Fahrenheit to Celsius
    2. Celsius to Fahrenheit
    0. Exit
    Công thức chuyển đổi:
    celsius = (5.0 / 9) * (fahrenheit - 32)*/
    public static void main(String[] args){
        int number;
        float celsius, fahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu\n1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit\n0. Exit\n");
        do {
            System.out.println("Choose a number: ");
            number = input.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Input F: ");
                    fahrenheit = input.nextFloat();
                    System.out.println(fahrenheit + " F = " + fahrenheitToCelsius(fahrenheit) + " C");
                    break;
                case 2:
                    System.out.println("Input C: ");
                    celsius = input.nextFloat();
                    System.out.println(celsius + " C = " + celsiusToFahrenheit(celsius) + " F");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect number");
            }
        }while(number != 0 );
    }
    public static double celsiusToFahrenheit(float celsius){
        return (celsius / (5.0/9)) + 32;
    }
    public static double fahrenheitToCelsius(float fahrenheit){
        return (5.0/9) * (fahrenheit - 32);
    }
}
