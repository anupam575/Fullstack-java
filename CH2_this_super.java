package com.company;

class EkClass{
    int a;

    public int getA() {
        return a;
    }

    EkClass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
class Doclass extends EkClass{
    Doclass(int c){
        super(c);
        System.out.println("mai ek constructor");
    }
}
public class CH2_this_super {
    public static void main(String[] args) {
        EkClass e = new EkClass(5);
        Doclass  d = new Doclass(50);
        System.out.println(e.getA());

    }
}
