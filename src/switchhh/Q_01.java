package switchhh;/*
Using switch statement Write a JAVA program to input marks of five subjects Physics, Chemistry,Biology, Mathematics and Computer.
Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
 */


import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the marks of sub1");
        float sub1 = scanner.nextFloat();
        System.out.println("enter the marks of sub2");
        float sub2 = scanner.nextFloat();
        System.out.println("enter the marks of sub3");
        float sub3 = scanner.nextFloat();
        System.out.println("enter the marks of sub4");
        float sub4 = scanner.nextFloat();

        float total = sub1+sub2+sub3+sub4;
        float percentage = total/400 *100;
        int p =(int)percentage;

        switch (p){
            case 90 -> System.out.println("Grade A");
        }

    }
}
