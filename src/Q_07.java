import java.util.Scanner;

//JAVA Program to take the value from the user as input any alphabet and check whether it is
//        vowel or consonant. Using the switch statement.
public class Q_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the alphabet");

        char letter = scanner.next().charAt(0);
        switch (letter) {
            case 'a', 'u', 'i', '0', 'e' -> System.out.println("IT is a vowel");
            default -> System.out.println("It is consonant");
        }
    }
}
