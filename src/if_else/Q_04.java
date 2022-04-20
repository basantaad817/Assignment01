package if_else;//Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
import java.util.Scanner;


public class Q_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        if (num1%5==0&&num1%11==0) {
            System.out.println("Divisible by 5 and 11!");
        } else {
            System.out.println("Not divisible by 5 and 11!");
        }
    }
}
