package validation;

import models.Services;
import models.*;

import static jdk.nashorn.internal.objects.NativeString.trim;

public class IdServiceRegExp extends Exception {
//    -	Mã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là:
//            -	Nếu là Villa thì XX sẽ là VL
//-	Nếu là House thì XX sẽ là HO
//-	Nếu Room thì XX sẽ là RO

    public IdServiceRegExp(String message) {
        super(message);
    }

    public String idServiceRegExp(Services service, String id) throws IdServiceRegExp {
        String patternIdVilla = "^(SVVL-[0-9]{4})$";
        String patternIdHouse = "^(SVHO-[0-9]{4})$";
        String patternIdRoom = "^(SVRO-[0-9]{4})$";
        id = trim(id);
        if( service instanceof Villa && id.matches(patternIdVilla)){
            return id;
        }else if( service instanceof House && id.matches(patternIdHouse)){
            return id;
        }if( service instanceof Room && id.matches(patternIdRoom)){
            return id;
        }else{
            throw new IdServiceRegExp("Invalid ID service");
        }
    }
}
