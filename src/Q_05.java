//WAP to display multiplication table of a given no.
public class Q_05 {
    public static void main(String[] args) {

        //For loop
        for (int n1=1; n1<10; n1++) {
            int product = n1*3;
            System.out.println("3 x "+n1+" = "+product);
            n1++;
        }

        //While loop
        int n2=1;
        while (n2<10) {
            int product = n2*3;
            System.out.println("3 x "+n2+" = "+product);
            n2++;
        }

        //Do-while loop
        int n3=1;
        do {
            int product = n3*3;
            System.out.println("3 x "+n3+" = "+product);
            n3++;
        } while (n3<10);
    }
}
