package if_else;//Write a JAVA program to count total number of notes in given amount.
import java.util.Scanner;

public class Q_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount");
        int amount = scanner.nextInt();

        if (amount%5==0){
            int note = amount/5;
            System.out.println("Total number of 5 rupees note required is: "+ note);
        }
        else {
            System.out.println("Enter another number");
        }
    }

}
