package JOP;//Take 3 inputs from user and check :
//        all are equal
//        any of two are equal
//        ( use && || with ternary operator )

import javax.swing.*;

public class Q_11 {
    public static void main(String[] args) {

        System.out.println("Enter the 1st integer");
        int first = Integer.parseInt(JOptionPane.showInputDialog("Enter the 1st integer"));
        int second = Integer.parseInt(JOptionPane.showInputDialog("Enter the 2nd integer"));
        int third = Integer.parseInt(JOptionPane.showInputDialog("Enter the 3rd integer"));

        String output;
        output = (first==second && second==third)? "All are same":(first == second || second==third ||first==third)?"Two inputs are same":"nothing is same";

        JOptionPane.showMessageDialog(null,output);
    }
}
