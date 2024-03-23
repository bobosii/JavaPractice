package FighterGame;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Emir",20,150,100,20);
        Fighter f2 = new Fighter("Hasan",30,100,85,25);

        Match match = new Match(f1,f2,50,140);
        match.run();
    }
}
