package Classes;

public class Car {
    String type;
    String age;
    String color;
    String model;
    int speed;
    int speedLimit = 120;

    public Car(String type, String age, String color, String model, int speed, int speedLimit) {
        this.type = type;
        this.age = age;
        this.color = color;
        this.model = model;
        this.speed = speed;
        this.speedLimit = speedLimit;
    }

    int increaseSpeed(int increment){
        if ((this.speed + increment) < speedLimit){
            this.speed += increment;
        }
        return this.speed;
    }
    int decreaseSpeed(int decrement){
        if (this.speed > 0){
            this.speed -= decrement;
        }
        return this.speed;
    }
    void printSpeed(int speed){
        System.out.println("Hızınız : " + speed);
    }
    void printInfo(){
        System.out.println("Model :\t" + this.model);
        System.out.println("Color :\t" + this.color);
        System.out.println("Age :\t" + this.age);
        System.out.println("Type :\t" + this.type);
        System.out.println("Max Speed :\t" + speedLimit);
    }
}
