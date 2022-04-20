package JOP;//Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
//        check if both the conditions 'a < 50' and 'a < b' are true.

import javax.swing.*;

public class Q_12 {
    public static void main(String[] args) {
        System.out.println("Enter a number1");
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a number1"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter a number2"));
        String output;
        output = (a<50 && a<b)?"First number is smaller than 50 and second number":"the condition is false";
        JOptionPane.showMessageDialog(null,output);
    }
}
