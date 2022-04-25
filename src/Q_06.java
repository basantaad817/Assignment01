//JAVA Program to check whether a character is an alphabet or not. Using the switch statement.

import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char str = input.next().charAt(0);
        boolean result = Character.isDigit(str);
        int res;


        if (result == true) {
            res = 1;
            switch (res) {
                case 1:
                    System.out.println("'" + str + "' is a number");
                    break;
            }
        } else {
            System.out.println("'" + str + "' is a letter");
        }
    }
}
