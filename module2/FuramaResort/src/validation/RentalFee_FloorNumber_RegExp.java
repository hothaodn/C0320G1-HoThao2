package validation;

public class RentalFee_FloorNumber_RegExp extends Exception {
    public RentalFee_FloorNumber_RegExp(String message) {
        super(message);
    }

    public Double rentalFeeRegExp(Double rentalFee) throws RentalFee_FloorNumber_RegExp{
        if(rentalFee > 0){
            return rentalFee;
        }else{
            throw new RentalFee_FloorNumber_RegExp("Must be larger than 0");
        }
    }

    public Integer FloorNumberRegExp(int numberFloor) throws RentalFee_FloorNumber_RegExp{
        if(numberFloor > 0){
            return numberFloor;
        }else{
            throw new RentalFee_FloorNumber_RegExp("Must be larger than 0");
        }
    }
}
