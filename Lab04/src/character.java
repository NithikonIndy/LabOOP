public class character {
        //create base status
    character (String name,String job){

    }
    public interface Job {

    }

    public interface Warrior extends Job {
        // base status of warrior
    }
    public interface Arches extends Job {
        // base status of arches

    }

    public interface EquipmetOfWarrior extends Warrior{
        // Can choose sword and shield only
    }

    public interface EquipmetOfArches extends Arches{
        // Can choose bow and shield arrow
    }
    public interface Accessorier extends Warrior,Arches{
        // all job can wear all accessorier
    }
    public interface Sword extends EquipmetOfWarrior {
        //increase status
    }
    public interface Shield extends EquipmetOfWarrior{
        //increase status
    }
    public interface Ring extends Accessorier {
        //increase status
    }
    public interface Boots extends Accessorier {
        //increase status
    }
    public interface Bow extends EquipmetOfArches{
        //increase status
    }
    public interface Arrow extends EquipmetOfArches{
        //increase status
    }

}

