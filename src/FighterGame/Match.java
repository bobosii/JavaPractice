package FighterGame;
import java.util.Random;

public class Match {
    Fighter fighter1;
    Fighter fighter2;
    int minWeight;
    int maxWeight;

    public Match(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    boolean isCheck(){
        return (fighter1.weight < maxWeight && fighter1.weight > minWeight) && (fighter2.weight < maxWeight && fighter2.weight > minWeight);
    }
    void run(){
        if (isCheck()){
            while (this.fighter1.health > 0 && this.fighter2.health>0){
                if (determinateFighter()){
                    fighter2.health = fighter1.hit(fighter2);
                    System.out.println(fighter2.name+ " " +fighter2.health);
                    System.out.println(fighter1.name+ " " +fighter1.health);
                    System.out.println("===== NEW ROUND ======");
                }
                else {
                    fighter1.health = fighter2.hit(fighter1);
                    System.out.println(fighter2.name+ " " +fighter2.health);
                    System.out.println(fighter1.name+ " " +fighter1.health);
                    System.out.println("===== NEW ROUND ======");
                }
            }
            if (this.fighter1.health > this.fighter2.health){
                System.out.println(fighter1.name +" WON !" );
            }else {
                System.out.println(fighter2.name +" WON !" );
            }

        }else {
            System.out.println("Boxers can't start a match because of weight standarts");
        }
    }
    boolean determinateFighter(){
        Random rand = new Random();
        int result = rand.nextInt(2);
        return result == 0;
    }
}
