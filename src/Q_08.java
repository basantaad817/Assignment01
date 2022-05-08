import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        int count1 = 1, count2 = 1, count3 = 1;
        Scanner input = new Scanner(System.in);

        //For loop
        System.out.print("Enter a number: ");

        for (int i=input.nextInt(); i>0; i--) {
            count1=count1*i;
        }
        System.out.println("Factorial: "+count1);

        //While loop
        System.out.print("Enter a number: ");

        int j = input.nextInt();
        while (j>0) {
            count2=count2*j;
            j--;
        }
        System.out.println("Factorial: "+count2);

        //Do-while loop
        System.out.print("Enter a number: ");

        int k = input.nextInt();
        do {
            count3=count3*k;
            k--;
        } while (k>0);
        System.out.println("Factorial: "+count3);
    }
}
