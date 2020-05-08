import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args){
        //Giả sử bạn đang tham gia viết chương trình cho máy đo chiều cao cân nặng,
        // hãy viết một chương trình có khả năng đọc các số nguyên không âm có tối đa 3 chữ số.
        String number;
        String words = "";
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextLine();
        String[] arr = number.split("");
        if( arr.length == 1) {
            switch (number) {
                case "0":
                    words = "zero";
                    break;
                case "1":
                    words = "one";
                    break;
                case "2":
                    words = "two";
                    break;
                case "3":
                    words = "three";
                    break;
                case "4":
                    words = "four";
                    break;
                case "5":
                    words = "five";
                    break;
                case "6":
                    words = "six";
                    break;
                case "7":
                    words = "seven";
                    break;
                case "8":
                    words = "eight";
                    break;
                case "9":
                    words = "nine";
                    break;
            }
        }else if( arr.length == 2 && ){
            if (number == "10") {
                words = "ten";
            }else if (number == "11") {
                words = "eleven";
            }else if (number == "12") {
                words = "twelve";
            } else if (number == "13") {
                words = "thirteen";
            }else{
                switch (arr[1]) {
                    case "4":
                        words = "four";
                        break;
                    case "5":
                        words = "five";
                        break;
                    case "6":
                        words = "six";
                        break;
                    case "7":
                        words = "seven";
                        break;
                    case "8":
                        words = "eight";
                        break;
                    case "9":
                        words = "nine";
                        break;
                }
                words += "teen";
            }
        }
        System.out.println(words);
    }
}
