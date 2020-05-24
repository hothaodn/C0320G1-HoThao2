package validation;

public class AccompaniedServiceRegExp extends Exception {
    //-	 Dịch vụ đi kèm phải là các giá trị: massage, karaoke, food, drink, car

    public AccompaniedServiceRegExp(String message) {
        super(message);
    }

    public String accompaniedServiceRegExp(String accompaniedServiceName) throws AccompaniedServiceRegExp {
        if(accompaniedServiceName == "Massage" || accompaniedServiceName == "Karaoke" || accompaniedServiceName == "Food"
            accompaniedServiceName == "Drink" || accompaniedServiceName == "Car"){
            return accompaniedServiceName;
        }else{
            throw new AccompaniedServiceRegExp("It is not accompanied service ");
        }
    }
}
