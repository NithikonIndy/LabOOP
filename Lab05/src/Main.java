public class Main {
    public static void main(String[] args) {
        Character.Warrior character1 = new Character.Warrior("A");
        character1.ShowStatus_ofWarrior();
        character1.LevelUp_ofWarrior();
        character1.ShowStatus_ofWarrior();
        Accessorier.Boots wearchar1 = new Accessorier.Boots();
        wearchar1.turnonwalkonwatermode();
        wearchar1.turnoffwalkoffwatermode();
        wearchar1.turnonwalkonwatermode();

        System.out.println();

        Character.Arches character2= new Character.Arches("B");
        character2.ShowStatus_ofArches();
        character2.LevelUp_ofArches();
        character2.ShowStatus_ofArches();
        Accessorier.Ring wearchar2 = new Accessorier.Ring();
        wearchar2.turnoninvisiblemode();
        wearchar2.turnoffinvisiblemode();
        wearchar2.turnoninvisiblemode();
    }
}