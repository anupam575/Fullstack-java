package com.company;

public class method_overloading {
    static void foo() {
        System.out.println("Good Morning bro");
    }

    static void foo(int a) {
        System.out.println("Good morning " + a + " Bro");
    }
    static void foo(int a, int b) {
        System.out.println("Good morning " + a + " Bro");
        System.out.println("Good morning " + b + " Bro");

    }

    static void change(int a) {
        a = 98;
    }

    static void change2(int[] arr) {
        arr[0] = 98;
    }

    static void telljoke() {
        System.out.println("I invented a new word\n" + "Plagiarism");
    }

    public static void main(String[] args) {
        //telljoke();
        //case 1 changing the integer
        //int x = 45;
        // change(x);
        //System.out.println("the value of X after running change is: " + x);
        //int [] marks = {52, 73, 77, 89, 98, 94};
        //  change2(marks);
        // System.out.println("the value of X after running change is: " + marks[0]);
        foo();
        foo(3000);
        foo(3000,4000);// arguments
    }
}




