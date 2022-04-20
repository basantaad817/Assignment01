package if_else;//Write a JAVA program to input angles of a triangle and check whether triangle is valid or not.


import java.util.Scanner;

public class Q_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first angle: ");
        int angle1 = input.nextInt();
        System.out.println("Enter second angle: ");
        int angle2 = input.nextInt();
        System.out.println("Enter third angle: ");
        int angle3 = input.nextInt();

        if (angle1+angle2+angle3==180) {
            System.out.println("Triangle is valid.");
        } else {
            System.out.println("Triangle is invalid.");
        }
    }
}
