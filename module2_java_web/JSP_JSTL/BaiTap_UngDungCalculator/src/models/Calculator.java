package models;

public class Calculator {
    private Float firstOperand;
    private Float secondOperand;
    private String operator;

    public Calculator(Float firstOperand, Float secondOperand, String operator) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operator = operator;
    }

    public Double calculate(){
        double result = 0.0;
        switch (this.operator){
            case "+":
                result = this.firstOperand + this.secondOperand;
                break;
            case "-":
                result = this.firstOperand - this.secondOperand;
                break;
            case "*":
                result = this.firstOperand * this.secondOperand;
                break;
            case "/":
                result = this.firstOperand / this.secondOperand;
                break;
        }
        return result;
    }
}
