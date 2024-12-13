import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise and operator\n");
        System.out.println("please enter the first number: ");
        int first = input.nextInt();
        System.out.println("Now enter the other number: ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("Result is: " + result);
    }

}
