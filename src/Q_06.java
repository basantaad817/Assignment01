public class Q_06 {
    public static void main(String[] args) {
        int count1 = 0, count2 = 0, count3 = 0;

        //For loop
        for (int i=1; i<=10; i++) {
            count1=count1+i;
        }
        System.out.println("Sum: "+count1);

        //While loop
        int j=1;
        while (j<=10) {
            count2=count2+j;
            j++;
        }
        System.out.println("Sum: "+count2);

        //Do-while loop
        int k=1;
        do {
            count3=count3+k;
            k++;
        } while (k<=10);
        System.out.println("Sum: "+count3);
    }
}
