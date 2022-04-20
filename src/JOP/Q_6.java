package JOP;//Ask user to give two double input for length and breadth of a rectangle and print area type cast to int.

import javax.swing.*;

public class Q_6 {
    public static void main(String[] args) {
        double length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length"));
        double breadth = Double.parseDouble(JOptionPane.showInputDialog("Enter the breadth"));

        double area = length*breadth;
        int a = (int)area;

        JOptionPane.showMessageDialog(null,"The area of given rectangle is: "+a);
    }
}
