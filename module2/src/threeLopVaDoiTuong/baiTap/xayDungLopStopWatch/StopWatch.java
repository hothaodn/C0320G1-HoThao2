import java.util.Calendar;
import java.util.Scanner;

public class StopWatch {
    private String startTime;
    private String endTime;
    private int hour1;
    private int minute1;
    private int second1;
    private int hour2;
    private int minute2;
    private int second2;

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setStartTime(){
        //startTime = cal1.getTime();
    }

    public void start(){
        Calendar cal1 = Calendar.getInstance();
        //startTime = cal1.getTime();
        hour1 = cal1.get(Calendar.HOUR);
        minute1 = cal1.get(Calendar.MINUTE);
        second1 = cal1.get(Calendar.SECOND);
        startTime = hour1 + ":" + minute1 + ":" + second1;
    }

    public void stop(){
        Calendar cal2 = Calendar.getInstance();
        //endTime = cal2.getTime();
        hour2 = cal2.get(Calendar.HOUR);
        minute2 = cal2.get(Calendar.MINUTE);
        second2 = cal2.get(Calendar.SECOND);
        endTime = hour2 + ":" + minute2 + ":" + second2;
    }

    public void startCounting(){
        Scanner input = new Scanner(System.in);
        int count;
        while(true) {
            System.out.println("START: Press 1. END: Press 0");
            count = input.nextInt();
            switch (count) {
                case 1:
                    this.start();
                    System.out.println("Start time: " + this.getStartTime());
                    break;
                case 0:
                    this.stop();
                    System.out.println("End time: " + this.getEndTime());
                    System.out.println("Count: " + this.getElapsedTime() + " miliseconds");
                    break;
                default:
                    System.out.println("Do again");
            }
        }
    }

    public int getElapsedTime(){
        int hour = 0;
        int minute = 0;
        int second = 0;
        if( hour2 >= hour1){
            hour = hour2 - hour1;
        }else{
            hour = (12 - hour1) + hour2;
        }

        if( minute2 >= minute1){
            minute = minute2 - minute1;
        }else{
            hour = (60 - minute1) + minute2;
        }

        if( second2 >= second1){
            second = second2 - second1;
        }else{
            second = (60 - second1) + second2;
        }
        return (hour*60*60 + minute*60 + second*1000);
    }
}
