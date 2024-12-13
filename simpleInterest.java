import java.util.Scanner;

public class simpleInterest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welccome to Simple Interest Calculator\n");
        System.out.println("Please enter your principle amount Rs");
        int principle = input.nextInt();
        System.out.print("Now, tell me yor rate of interest:");
        float rate = input.nextFloat();
        System.out.println("Now tell me for how many years are you born");
        float years = input.nextFloat();

        float interest = (principle * rate * years) / 100;
        System.out.println("\n\n your Simple interest  is Rs:" + interest);
    }
}

