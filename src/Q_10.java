import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int digit;
        int i;
        int rev=0;

        //For loop
        for (i=num;i>0;i/=10) {
            digit = i % 10;
            rev = rev * 10 + digit;
        }
        System.out.println(rev);

        //While loop
        i=num;
        rev=0;
        while (i>0) {
            digit = i % 10;
            rev = rev * 10 + digit;
            i/=10;
        }
        System.out.println(rev);

        //Do-while loop
        i=num;
        rev=0;
        do {
            digit = i % 10;
            rev = rev * 10 + digit;
            i/=10;
        } while (i>0);
        System.out.println(rev);
    }
}
