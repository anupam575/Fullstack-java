package com.company;

class MyMainEmployee{
    private int id;
    private String name;
    public MyMainEmployee(){
       id = 07;
        name = "Your-Name-Here";
    }
     public MyMainEmployee(String myName, int myId){
       id = myId;
     name = myName;
     }
    public MyMainEmployee(String myName){
        id = 10;
        name = myName;
    }

    public String getName() { return name; }
    public void setName(String n) { this.name = n; }
    public void setId(int i) { this.id = i; }
    public int getId() { return id; }
}

public class CH_2_constructor {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee("podewithAnupam", 89);
       // MyMainEmployee harry = new MyMainEmployee("podewithAnupam");

       // MyMainEmployee harry = new MyMainEmployee();

        //  harry.setName("CodewithAnupam");
      //  harry.setId(37);
        System.out.println(harry.getId());
        System.out.println(harry.getName());

    }
}
