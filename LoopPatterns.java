import java.util.Scanner;

public class LoopPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are here to print patterns");
        System.out.print("please enter the no of rows: ");
        int rows = input.nextInt();
        printFirstPattern(rows);

    }
    public static void printFirstPattern(int maxrows) {
        int rows = 0;
        while ( rows < 5) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" * ");
                i++;

            }
            System.out.println();
            rows++;
        }
    }

}