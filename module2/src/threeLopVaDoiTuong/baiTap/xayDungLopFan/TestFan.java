public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan("Fan 1",10,"yellow");
        Fan fan2 = new Fan("Fan 2",5,"blue");
        fan1.setOn(true);
        fan1.setSpeed(3);
        fan2.setOn(false);
        //fan2.setOn(true);
        fan1.setSpeed(2);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

}
