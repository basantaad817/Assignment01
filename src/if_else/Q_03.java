package if_else;//Write a JAVA program to check whether a number is negative, positive or zero.
import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();

        if (num1>0) {
            System.out.println("Positive Number!");
        } else if (num1<0) {
            System.out.println("Negative Number!");
        } else {
            System.out.println("Zero!");
        }
    }
}
