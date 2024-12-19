package methods;

public class LearnMethod {

    public static void main(String[] args) {

        //   greet();
       // System.out.println(1);
        //System.out.println(2);
       // greet();
        //System.out.println(3);
        //System.out.println(4);

        average(4, 6,false);
        System.out.println("hello");
        average(2, 7,true);



    }
    static void greet() {
        System.out.println("5");
        System.out.println("Hello World");
        System.out.println("6");
    }
    public static void average (int a, int b, boolean shouldAverage) {
        int avg = (a+b)/2;
        System.out.println("The average is "+avg);
    }
}
