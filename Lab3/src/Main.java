public class Main {
    public static void main(String[] args) {
        character top = new character("top");
        top.LevelUp();
        top.ShowStatus();
        System.out.println();
        top.GetLevel(1);
        top.ShowStatus();
        System.out.println();
        top.GetLevel(100);
        top.LevelUp();
        System.out.println();
        top.GetLevel(101);
        top.ShowStatus();
    }
}