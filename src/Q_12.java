import java.util.Scanner;

public class Q_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        //For loop
        int j=0;
        for (int i=2; i<num; i++) {
            if (num%i==0) {
                j++;
            }
        }if (j==0) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }

        //While loop
        j=0;
        int i=2;
        while (i<num) {
            if (num%i==0) {
                j++;
                i++;
            }
        }if (j==0) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }

        //Do-while loop
        j=0;
        i=2;
        do {
            if (num%i==0) {
                j++;
                i++;
            }
        }while (i<num);
        if (j==0) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }
}
