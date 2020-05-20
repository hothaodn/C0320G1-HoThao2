import java.util.Scanner;

public class TinhChiSoCanNang {
    public static void main(String[] args){
        float height, weight;
        float bmi;
        Scanner input = new Scanner(System.in);
        System.out.println("Height (m): ");
        height = input.nextFloat();
        System.out.println("Weight (kg): ");
        weight = input.nextFloat();
        bmi = (float) (weight / Math.pow(height,2));
        String result;
        if( height > 0 && weight > 0){
            if( bmi >= 30){
                result = "OBESE";
            } else if( bmi >= 25 ){
                result = "OVERWEIGHT";
            } else if( bmi >= 18.5 ){
                result = "NORMAL";
            } else{
                result = "UNDERWEIGHT";
            }
            System.out.println("You are " + result+ " with BMI = " + bmi);
        }else{
            System.out.println("Invalid data");
        }
    }
}
