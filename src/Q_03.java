//WAP to display the number of even numbers between 10 and 30.

public class Q_03 {
    public static void main(String[] args) {
        int count1 = 0, count2 = 0, count3 = 0;

        //For loop
        for (int i = 10; i <= 30; i++) {
            if (i % 2 == 0) {
                count1++;
            }
            System.out.println("No. of even: " + count1);

            //While loop
            int j = 10;
            while (j <= 30) {
                if (j % 2 == 0) {
                    count2++;
                }
                j++;
            }
            System.out.println("No. of even: " + count2);

            //Do-While loop
            int k = 10;
            do {
                if (k % 2 == 0) {
                    count3++;
                }
                k++;
            } while (k <= 30);
            System.out.println("No. of even: " + count3);
        }
    }
}
