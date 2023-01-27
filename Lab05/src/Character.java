public class Character {
    protected String Name ;

    public static class Warrior extends Character {        // base status of warrior
        private int Level_ofWarrior =1;

        private double MaxHp_ofWarrior=100;
        private double MaxMana_ofWarrior=20;
        private  double BaseSpeed_ofWarrior=8;
        private double SwordBaseDamage_ofWarrior=10;
        private double ShieldBaseDefense_ofWarrior=15;

        private double MaxinumHp_ofWarrior(){
            return (this.MaxHp_ofWarrior=this.MaxHp_ofWarrior+(10*Level_ofWarrior));
        }
        private double MaxinumMana_ofWarrior(){
            return (this.MaxMana_ofWarrior=this.MaxMana_ofWarrior+(2*Level_ofWarrior));
        }
        private double Maxinumrunspeed_ofWarrior(){
            return (this.BaseSpeed_ofWarrior=this.BaseSpeed_ofWarrior*(0.1+0.03*Level_ofWarrior));
        }
        private double AttackDamage_ofWarrior(){
            return this.SwordBaseDamage_ofWarrior=this.SwordBaseDamage_ofWarrior*(1+0.1*Level_ofWarrior);
        }

        private double Defend_ofWarrior(){
            return this.ShieldBaseDefense_ofWarrior=this.ShieldBaseDefense_ofWarrior*(1+0.05*Level_ofWarrior);
        }
        private double AttackRunSpeedDecrease_ofWarrior(){
            return this.BaseSpeed_ofWarrior= BaseSpeed_ofWarrior *(0.25+0.05*Level_ofWarrior);
        }
        private double DefendRunSpeedDecrease_ofWarrior(){
            return this.BaseSpeed_ofWarrior=BaseSpeed_ofWarrior*(0.25+0.05*Level_ofWarrior);
        }

        private void createstatus(){
            MaxinumHp_ofWarrior();
            MaxinumMana_ofWarrior();
            Maxinumrunspeed_ofWarrior();
            AttackDamage_ofWarrior();
            Defend_ofWarrior();
            AttackRunSpeedDecrease_ofWarrior();
            DefendRunSpeedDecrease_ofWarrior();
        }
        /** Create Character Warrior
         * effect : none
         * @param : set name of Character Warrior and createstatus
         * @return : none
         * */
        protected Warrior(String name) {
            this.Name=name;
            createstatus();
        }
        /** Uplavel Character
         * effect : increate Level_ofArches and update stauts
         * @param : none
         * @return : none
         * */
        protected int LevelUp_ofWarrior(){ //when character levelup all status ,Wiill up eg MaxHp ,MaxMana and level can't more than maxlevel
            Level_ofWarrior++;
            MaxinumHp_ofWarrior();
            MaxinumMana_ofWarrior();
            Maxinumrunspeed_ofWarrior();
            AttackDamage_ofWarrior();
            Defend_ofWarrior();
            AttackRunSpeedDecrease_ofWarrior();
            DefendRunSpeedDecrease_ofWarrior();

            return Level_ofWarrior;

        }
        /** ShowStatus of Warrior
         * effect : show all status eg Name MaxHP Level
         * @param : none
         * @return : none
         * */
        protected void ShowStatus_ofWarrior() {
            System.out.println("Name : "+ Name);
            System.out.println("Level : "+ Level_ofWarrior);
            System.out.println("MaxHP : "+ MaxHp_ofWarrior);
            System.out.println("MaxMana : " + MaxMana_ofWarrior);
            System.out.println("BaseSpeed : "+BaseSpeed_ofWarrior);
            System.out.println("Damage : "+SwordBaseDamage_ofWarrior);
            System.out.println("Defend : "+ShieldBaseDefense_ofWarrior);
        }
    }


    public  static class Arches extends Character {        // base status of arches
       private int Level_ofArches =1 ;

        private double MaxHp_ofArches=70;
        private double MaxMana_ofArches=20;
        private  double BaseSpeed_ofArches=20;
        private double BowBaseDamage_ofArches=10;
        private double ArrowBaseDefense_ofArches=5;

        private double MaxinumHp_ofArches(){
            return (this.MaxHp_ofArches=this.MaxHp_ofArches+(5*Level_ofArches));
        }
        private double MaxinumMana_ofArches(){
            return (this.MaxMana_ofArches=this.MaxMana_ofArches+(2*Level_ofArches));
        }
        private double Maxinumrunspeed_ofArches(){
            return (this.BaseSpeed_ofArches=this.BaseSpeed_ofArches*(0.3+0.03*Level_ofArches));
        }
        private double attackDamage_ofArches(){

            return (this.BowBaseDamage_ofArches=this.BowBaseDamage_ofArches*(5+0.5*Level_ofArches))+ArrowBaseDefense_ofArches ;
        }

        private double ShotRunSpeedDecrease_ofArches(){

            return this.BaseSpeed_ofArches= BaseSpeed_ofArches *(0.5+0.05*Level_ofArches);
        }


        private void createstatus_ofArches(){
            MaxinumHp_ofArches();
            MaxinumMana_ofArches();
            Maxinumrunspeed_ofArches();
            attackDamage_ofArches();
            ShotRunSpeedDecrease_ofArches();
        }
        /** Create Character Arches
         * effect : none
         * @param : set name of Character Arches and createstatus
         * @return : none
         * */
        protected Arches(String name) {
            this.Name=name;
            createstatus_ofArches();
        }
        /** Uplavel Character
         * effect : increate Level_ofArches and update stauts
         * @param : none
         * @return :update Level_ofArches
         * */
        protected int LevelUp_ofArches(){ //when character levelup all status ,Wiill up eg MaxHp ,MaxMana and level can't more than maxlevel
            Level_ofArches++;
            MaxinumHp_ofArches();
            MaxinumMana_ofArches();
            Maxinumrunspeed_ofArches();
            attackDamage_ofArches();
            ShotRunSpeedDecrease_ofArches();

            return Level_ofArches;

        }
        /** ShowStatus of Arches
         * effect : show all status eg Name MaxHP Level
         * @param : none
         * @return : none
         * */
        protected void ShowStatus_ofArches() {
            System.out.println("Name : "+ Name);
            System.out.println("Level : "+ Level_ofArches);
            System.out.println("MaxHP : "+ MaxHp_ofArches);
            System.out.println("MaxMana : " + MaxMana_ofArches);
            System.out.println("BaseSpeed : "+BaseSpeed_ofArches);
            System.out.println("Damage : "+BowBaseDamage_ofArches);
        }
    }

}
