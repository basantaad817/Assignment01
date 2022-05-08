package switchhh;
//AVA Program to take the value from the user as input the month number and print number of
//        days in that month. Using switch statement
import java.util.Scanner;
public class Q_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int month = input.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days");
                break;
            case 2:
                System.out.println("this month might have 28 or 29 days");
                break;
            default:
                System.out.println("Invalid month number");

        }

    }
}
