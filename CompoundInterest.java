

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to compound interest calculator\n");
        System.out.print("please enter your principle amount Rs");
        int principle = input.nextInt();
        System.out.print("now, tell me rate of your interest: ");
        float rate = input.nextFloat();
        System.out.print("Now, tell me for haow many years are you");
        float years = input.nextFloat();

        double compInt = principle * Math.pow((1 + rate / 100), years);
        System.out.println("your compound interest is Rs:" + compInt);
    }
}





