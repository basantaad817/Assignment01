import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int i,digit,even=0,odd=0;

        //For loop
        for (i=num;i>0;i/=10) {
            digit = i % 10;
            if (digit%2==0) {
                even=even+digit;
            } else {
                odd=odd+digit;
            }
        }
        System.out.println("Sum of even: "+even);
        System.out.println("Sum of odd: "+odd);

        //While loop
        i=num;
        while (i>0) {
            digit = i % 10;
            if (digit%2==0) {
                even=even+digit;
            } else {
                odd=odd+digit;
            }
            i/=10;
        }
        System.out.println("Sum of even: "+even);
        System.out.println("Sum of odd: "+odd);

        //Do-while loop
        i=num;
        do {
            digit = i % 10;
            if (digit%2==0) {
                even=even+digit;
            } else {
                odd=odd+digit;
            }
            i/=10;
        } while (i>0);
        System.out.println("Sum of even: "+even);
        System.out.println("Sum of odd: "+odd);
    }
}
