package if_else;//Write a JAVA program to check whether a year is leap year or not.

import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = input.nextInt();
        if ((year%4==0&&year%100!=0)||year%400==0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Normal Year");
        }
    }
}
