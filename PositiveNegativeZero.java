
import java.util.Scanner;

public class PositiveNegativeZero {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number checker\n");
        System.out.print("please  enter your number");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println("your number is positive");

        }else if (num == 0) {
            System.out.println("your number is zero");
        }else {
            System.out.println("your number is negative");
        }
    }
}