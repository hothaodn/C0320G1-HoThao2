package validation;

import java.util.Calendar;

public class BirthdayRegExp extends Exception {
//    -	Ngày sinh phải nhỏ hơn ngày hiện tại 18 năm và phải đúng định dạng dd/mm/YYYY

    public BirthdayRegExp(String message) {
        super(message);
    }

//    public String birthdayRegExp(String birthday) throws BirthdayRegExp{
//        String patternBirthday = "/^(0[1-9]|[12][0-9]|3[01])\\/(0[1-9]|1[12])\\/[0-9]{3}[1-9]$/";
//        String[] arr = patternBirthday.split("/");
//        int birthdayYear = Integer.parseInt(arr[2]);
//        int currentYear = Integer.parseInt(Calendar.getInstance().get(Calendar.YEAR));
//        if(birthday.matches(patternBirthday) && (birthdayYear < (currentYear - 18))){
//            return birthday;
//        }else{
//            throw new BirthdayRegExp("Just applied for format dd/mm/YYYY and age must be larger than 18ys");
//        }
//    }
}
