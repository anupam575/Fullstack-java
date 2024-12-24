package com.company;

public class Ch2_varargs {

    //static int sum(int a, int b) {
      // return a+b;
    //}
    //static int sum(int a, int b, int c) {
   //     return a+b+c;
   // }
    //static int sum(int a, int b, int c, int d) {
    //    return a+b+c+d;
   // }

    static int sum(int ...arr){
        int result=0;
        for(int a: arr){
            result += a;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("The sum of Nothing is: " + sum());
        System.out.println("The sum of 1 Nothing is: " + sum(1));



        System.out.println("The sum of  2, 4, 3 and 5 is: " + sum(4,5,8, 3,5,2,1,8,5));



    }
}
