import java.util.Random;

public class AirPurifier {
    String model;
    String serialno;
    String color;
    int pm;
    int currentspeed;
    int maxspeed=10;

    boolean power;
    static int modelcount;
    static int colorcount;
    public void turnon(){
        power = true;
        if(currentspeed>0){}
        else {
            currentspeed =1;
            measuremust();
        }
    }
    public void turnoff() {
        power=false;
        currentspeed=0;
    }

    public int setspeed(int speed){
        if(power=true){
            if(currentspeed>=1&&currentspeed<=maxspeed){
                this.currentspeed=speed;
            }else{
                System.out.println("range of speed 1-10 ,please enter speedfan again ");
                this.currentspeed=0;
            }
        }
        return this.currentspeed=speed;
    }
    public int measuremust(){
        Random d= new Random();
        return this.pm = d.nextInt(100);
    }
    public void display (){
        System.out.println("speed : " + currentspeed);
        System.out.println("PM : " + pm);
    }

    public String  mostpopularmodel(){
        // count of model that popular and show
        return null;
    }
    public String  mostpopularcolor(){
        // count of color that popular and show
        return null;
    }

    AirPurifier(String model,String serialno,String color){
        this.model=model;
        this.serialno=serialno;
        this.color=color;
    }

}
