package com.company;

public class CH2_methods {
    static int logic(int x, int y){
     //int logic(int x, int y){




        int z;
        if(x>y){
            z = x+y;
        }
        else { // a,b,a1,b1 = x and y in copy
            z = (x + y) * 5;

        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        // method invocation using object creation
        //CH2_methods obj = new CH2_methods();
        //c = obj.logic(a, b); // method call
         c = logic(a, b); //method call  {method call part 2}


        int a1 = 2;
        int b1 = 18;
        int c1;
        //c1 = obj.logic(a1, b1); //method call
        c1 = logic(a1, b1); //method call

        System.out.println(c);
        System.out.println(c1);














    }
}
