//WAP to display even number between 10 and 30.
public class Q_02 {
    public static void main(String[] args) {

        //For loop
        for (int i=10; i<=30; i+=2) {
            System.out.println(i);
        }

        //While loop
        int j=10;
        while (j<=30) {
            System.out.println(j);
            j+=2;
        }

        //Do-While loop
        int k=10;
        do {
            System.out.println(k);
            k+=2;
        } while (k<=30);
    }

}
