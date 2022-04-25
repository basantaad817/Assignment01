import java.util.Scanner;

//JAVA Program to take the value from the user as an input week number and print weekday by
//        using the switch statement.
public class Q_10 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the week number");
        int week = scanner.nextInt();
        switch (week){
            case 1:
                System.out.println("Sunday");
            case 2:
                System.out.println("Monday");
            case 3:
                System.out.println("Tuesday");
            case 4:
                System.out.println("Wednesday");
            case 5 :
                System.out.println("Thursday");
            case 6:
                System.out.println("Friday");
            case 7:
                System.out.println("Saturday");
            default:
                System.out.println("Invalid week number");
        }
    }
}
