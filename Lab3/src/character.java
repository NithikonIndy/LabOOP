import javax.swing.*;

public class character {
    private String name;
    private int Level = 1 ;
    private int MaxLevel=100;
    private double MaxHp =100;
    private double MaxMana=20;
    private double BaseSpeed = 5;
    private double SwordBaseDamage=10;
    private double ShieldBaseDefense=5;


    character (String name){
        this.name=name;
    }

    private double MaxinumHp(){
        return (this.MaxHp=this.MaxHp+(10*Level));
    }
    private double MaxinumMana(){
        return (this.MaxMana=this.MaxMana+(2*Level));
    }
    private double Maxinumrunspeed(){
        return (this.BaseSpeed=this.BaseSpeed*(0.1+0.03*Level));
    }
    private double SwordDamage(){
        return this.SwordBaseDamage=this.SwordBaseDamage*(1+0.1*Level);
    }
    private double ShieldDefend(){
        return this.ShieldBaseDefense=this.ShieldBaseDefense*(1+0.05*Level);
    }
    private double SwordRunSpeedDecrease(){
        return this.BaseSpeed=BaseSpeed*(0.1+0.01*Level);
    }
    private double ShieldRunSpeedDecrease(){
        return this.BaseSpeed=BaseSpeed*(0.1+0.02*Level);
    }
    public int LevelUp(){ //when character levelup all status ,Wiill up eg MaxHp ,MaxMana and level can't more than maxlevel
     if(this.Level<=MaxLevel){
         Level++;
         MaxinumHp();
         MaxinumMana();
         Maxinumrunspeed();
         SwordDamage();
         ShieldDefend();
         SwordRunSpeedDecrease();
         ShieldRunSpeedDecrease();
     }
        return Level;

    }
    public void GetLevel(int level){ // You can get level but  ,NO more than  maxlevel and Can't change level if current level more than parameter level
        if(level>=0){
            if(level<=MaxLevel){
                while (this.Level<level){
                    LevelUp();
                }
            }else {
                System.out.println("you have Maxlevel You cannot level up any more");
            }
        }else {
            System.out.println("please enter nonnegative interger");
        }
    }

    public void ShowStatus(){   //show all status of character
        System.out.println("Name : "+ name);
        System.out.println("Level : "+ Level);
        System.out.println("MaxHP : "+ MaxHp);
        System.out.println("MaxMana : " + MaxMana);
        System.out.println("BaseSpeed : "+BaseSpeed);
        System.out.println("SwordDamage : "+SwordBaseDamage);
        System.out.println("Shield : "+ShieldBaseDefense);
    }




}
