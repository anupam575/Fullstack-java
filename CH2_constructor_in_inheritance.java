package com.company;

class Base1{
    Base1(){
        System.out.println("mai ek constructor ");
    }
    Base1(int x){
        System.out.println("mai ek overload constructor with value of x as: " + x);
    }

    // public int x;

    //public int getX() {
      //  return x;
    //}

    //public void setX(int x) {
        //this.x = x;
    //}
}


class Derived1 extends Base1{
    Derived1(){
        //super(0);
        System.out.println("i am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("mai ek overload of derived value with constructor with value of y as: " + y);


    }
   // public int y;

    //public int getY() {
      //  return y;
   // }

    //public void setY(int y) {
      //  this.y = y;
    //}
}
class ChildofDerived extends Derived1{
    ChildofDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildofDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am overload constructor of derived with value of z as: " + z);

    }
}
public class CH2_constructor_in_inheritance {
    public static void main(String[] args) {
       // Base1 b = new Base1();
        //Derived1 d = new Derived1();
      //  Derived1 d = new Derived1(4,9);
        ChildofDerived cd = new ChildofDerived(12,13,15);

    }
}
