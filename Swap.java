
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Swapping station\n\n");
        System.out.println("Enter value of A:");
        int a = input.nextInt();
        System.out.println("Enter value of B:");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Value of a is :" + a);
        System.out.println("Vlaue of B is :" + a);


    }
}