package oops2;

public class Car extends Vehicle {
    String color;


    void start() {
        Scooter scooterObj = new Scooter();
        scooterObj.braking(this);
        super.start();

        System.out.println(this);
        System.out.println(this.model+"Car is starting");
    }
    Car braking() {
        return this;
    }
    Car() {
        super(2);
        System.out.println("Car is being created");
    }
    public static void main(String[] args) {
        Car obj = new Car();
        System.out.println(obj.wheelsCount);

        obj.wheelsCount = 4;
        obj.model = "I10";
        obj.color = "Red";
        obj.start();
        System.out.println(obj.wheelsCount);

    }
}
//  super is  an implicit reference variable keyword used to represent the immediate parent class
// this is an implicit reference variable keyword used to reprsent the current class
class Scooter {
    void braking(Car car) {
        System.out.println(car.model+" is braking");
    }
}