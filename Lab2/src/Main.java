public class Main {
    public static void main(String[] args) {

        AirPurifier myair = new AirPurifier("Xiaomi","K69","white");
        myair.turnon();
        myair.display();
        myair.setspeed(3);
        myair.display();
        myair.setspeed(11);
        myair.display();
        myair.setspeed(0);
        myair.display();
        myair.turnoff();
        myair.display();
        AirPurifier.mostpopularcolor();
        AirPurifier.mostpopularmodel();
    }
}