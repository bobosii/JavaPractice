package FighterGame;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Emir",20,150,100,100);
        Fighter f2 = new Fighter("Hasan",30,100,85,0);

        Match match = new Match(f1,f2,50,140);
        match.run();
    }
}
