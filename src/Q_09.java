import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //For loop
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        System.out.print("Enter exponent: ");
        int pow=input.nextInt();

        int result=1,result2=1,result3=1;

        for (int i=0; i<pow; i++) {
            result=result*num;
        }
        System.out.println("Result: "+result);

        //While loop
        int j = 0;
        while (j<pow) {
            result2=result2*num;
            j++;
        }
        System.out.println("Result: "+result2);

        //Do-while loop
        int k = 0;
        do {
            result3=result3*num;
            k++;
        } while (k<pow);
        System.out.println("Result: "+result3);
    }
}
