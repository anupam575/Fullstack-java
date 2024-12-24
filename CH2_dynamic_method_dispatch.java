package com.company;
class Phone{
    public void greet() {
        System.out.println("Good Morning");
    }
    public void on() {
        System.out.println("Turning on phone");
    }

}

class SmartPhone extends Phone{
    public void swagat() {
        System.out.println("My name is swagat");
    }


    public void on(){
        System.out.println("Turning on smartphone");
    }
}

public class CH2_dynamic_method_dispatch {
    public static void main(String[] args) {
        //  Phone obj = new Phone();
       // obj.name();
        Phone obj = new SmartPhone();// yes it is allowed
       // SmartPhone obj2 = new Phone(); //not allowed
        obj.greet();
        obj.on(); // reference is not run obj is reference


    }
}
