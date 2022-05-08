//WAP to display no. of even and no. of odd number between 10 and 30.

public class Q_04 {
    public static void main(String[] args) {
        int count11=0, count12=0,count21=0, count22=0,count31=0, count32=0;

        //For loop
        for (int i=10; i<=30; i++) {
            if (i%2==0) {
                count11++;
            } else {
                count12++;
            }
        }
        System.out.println("No. of even: "+count11+"\nNo.of odd: "+count12);

        //While loop
        int j=10;
        while (j<=30) {
            if (j%2==0) {
                count21++;
            } else {
                count22++;
            }
            j++;
        }
        System.out.println("No. of even: "+count21+"\nNo.of odd: "+count22);

        //Do-While loop
        int k=10;
        do {
            if (k%2==0) {
                count31++;
            } else {
                count32++;
            }
            k++;
        } while (k<=30);
        System.out.println("No. of even: "+count31+"\nNo.of odd: "+count32);
    }
}
