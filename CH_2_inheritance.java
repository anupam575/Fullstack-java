package com.company;

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class CH_2_inheritance {




    public static void main(String[] args) {
        // creating an object of base class

      //  Derived b = new Derived();

        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        // creating an object of derived class

        Derived d = new Derived();
        d.setY(4);
        System.out.println(d.getY());


    }
}
