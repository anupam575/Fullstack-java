package com.company;
class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void method2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    public void method2(){
        System.out.println("I am method 3 of class b");

    }
    public void method3(){
        System.out.println("I am method 3 ofer class b");

    }


}
public class CH2_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.method2();
        B b = new B();
        b.method2();

    }
}
