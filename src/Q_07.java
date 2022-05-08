import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {

        //For loop
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();

        for (int n1=1; n1<=10; n1++) {
            int product = n1*num1;
            System.out.println(num1+" x "+n1+" = "+product);
        }

        //While loop
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num2 = input2.nextInt();

        int n2=1;
        while (n2<=10) {
            int product = n2*num2;
            System.out.println(num2+" x "+n2+" = "+product);
            n2++;
        }

        //Do-while loop
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num3 = input3.nextInt();

        int n3=1;
        do {
            int product = n3*num3;
            System.out.println(num3+" x "+n3+" = "+product);
            n3++;
        } while (n3<=10);
    }
}
