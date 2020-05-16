package xayDungLopStopWatch;

import java.util.Calendar;

public class JustDraftToTestCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println("Ngày hiện tại là " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Tháng hiện tại là " + (cal.get(Calendar.MONTH)+1));
        System.out.println("Năm hiện tại là " + cal.get(Calendar.YEAR));
        System.out.println("Giờ hiện tại là " + cal.get(Calendar.HOUR));
        System.out.println("Giờ hiện tại là " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Phút hiện tại là " + cal.get(Calendar.MINUTE));
        System.out.println("Giây hiện tại là " + cal.get(Calendar.SECOND));
    }
}
