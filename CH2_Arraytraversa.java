package com.company;

public class CH2_Arraytraversa {
    public static void main(String[] args) {
        //int [] marks = {98, 45, 79, 99, 80};
        float [] marks = {98.1f, 45.2f, 79.8f, 99.9f, 80.4f};
        //System.out.println(marks.length);
      //  System.out.println(marks[2]);

      //  String [] students = {"Harry", "Rohan", "Shubham", "Lovish"};


       // System.out.println(marks.length);
      //  System.out.println(marks[2]);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        for(int i=0;i< marks.length;i++) {
            System.out.println(marks[i]);
        }
        for(int i=marks.length -1;i>=0;i-- ) {
            System.out.println(marks[i]);

        }



    }
}
