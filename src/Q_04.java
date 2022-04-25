//JAVA Program to check whether a number is divisible by 5 and 11 or not. Using the switch
//        statement

public class Q_04 {
    public static void main(String[] args) {
        int num = 535;
        if (num% 11  ==0 && num%5 ==0){
            int result = 0;
            switch (result){
                case 0:
                    System.out.println("It is divisible by both 11 and 5");
            }

        }
        else {
            System.out.println("No it is not dividable by 11 and 5");
        }

    }
}
