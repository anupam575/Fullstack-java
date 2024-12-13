
import java.util.Scanner;

public class BitwiseCompliment {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of Not/Compliment Operator\n");
        System.out.print("please enter your number: ");
        int num = input.nextInt();
        int result =  ~num;
        System.out.println("Result is " + result);

    }

}
