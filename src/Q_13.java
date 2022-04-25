//JAVA Program to take the value from the user as input all sides of a triangle and check whether
//        the triangle is valid or not. Using switch statement


import java.util.Scanner;

public class Q_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side1");
        int side1 = scanner.nextInt();
        System.out.println("Enter side2");
        int side2 = scanner.nextInt();
        System.out.println("Enter side3");
        int side3 = scanner.nextInt();

        int result;
        if (side1+side2> side3 && side2+side3>side1 && side1+side3>side2){
            result = 0;
        }
        else {
            result = 1;
        }
        switch (result){
            case 0:
                System.out.println("It is a valid triangle");
                break;
            case 1:
                System.out.println("It is not a valid triangle");
        }
    }
}
