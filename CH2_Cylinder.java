package com.company;

class Cylinder{
    private int radius;
    private int height;


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public  double surfaceArea(){
        return 2* 3.14* radius * radius + 2*3.14*radius*height;
    }
    //public double volume(){
      //  return 3.142 * radius * radius * height;
    //}




}

public class CH2_Cylinder {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(19);
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.surfaceArea());
       // System.out.println(myCylinder.volume());



    }
}

