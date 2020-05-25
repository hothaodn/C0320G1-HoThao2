package validation;

public class serviceName_rentalType_standardRoom_RegExp extends Exception {
    public serviceName_rentalType_standardRoom_RegExp(String message) {
        super(message);
    }

//    public String serviceNameRegExp(String serviceName) throws serviceName_rentalType_standardRoom_RegExp {
//        String patternServiceName = "^[A-Z]{1}[a-z]";
//        serviceName = serviceName.trim();
//        if(serviceName.matches(patternServiceName)){
//            return serviceName;
//        }else if(!(serviceName.matches(patternServiceName))){
//            System.out.println("Input again");
//            serviceName =  serviceName.toLowerCase();
//            String[] arrString =  serviceName.split("");
//            arrString[0].toUpperCase();
//        }else{
//            throw new serviceName_rentalType_standardRoom_RegExp("Please put a capital letter at first of the name");
//        }
//    }

//    public String rentalTypeRegExp(String rentalType) throws serviceName_rentalType_standardRoom_RegExp {
//        String patternRentalType = "^[A-Z]{1}[a-z]";
//        rentalType = rentalType.trim();
//        if(rentalType.matches(patternRentalType)){
//            return rentalType;
//        }else if(!(rentalType.matches(patternRentalType))){
//            System.out.println("Input again");
//        }else{
//            throw new serviceName_rentalType_standardRoom_RegExp("Please put a capital letter at first of the name");
//        }
//    }

//    public String rentalTypeRegExp(String standardRoom) throws serviceName_rentalType_standardRoom_RegExp {
//        String patternRentalType = "^[A-Z]{1}[a-z]";
//        standardRoom = standardRoom.trim();
//        if(standardRoom.matches(patternRentalType)){
//            return standardRoom;
//        }else if(!(standardRoom.matches(patternRentalType))){
//            System.out.println("Input again");
//        }else{
//            throw new serviceName_rentalType_standardRoom_RegExp("Please put a capital letter at first of the name");
//        }
//    }
}
