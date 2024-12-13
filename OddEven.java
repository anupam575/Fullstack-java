
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd even calcualtor\n");
        System.out.print("plaese enter your number: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("your number is an even number");
        }else {
            System.out.println("your number is a odd number");
        }
    }

}