package JOP;//Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//of triangle and Volume of Cube and Cuboid. Take the attributes as user input.

import javax.swing.*;

public class Q_8 {
    public static void main(String[] args) {
        System.out.println("Enter a side1");
        double side1 = Double.parseDouble(JOptionPane.showInputDialog("Enter a side1"));
        double side2 = Double.parseDouble(JOptionPane.showInputDialog("Enter a side2"));
        double side3 = Double.parseDouble(JOptionPane.showInputDialog("Enter a side3"));

        double semi_perimeter = (side1+side2+side3)/2d;

        double area = Math.pow (semi_perimeter*(semi_perimeter-side1)*(semi_perimeter-side2)*(semi_perimeter-side3),0.5d);
        JOptionPane.showMessageDialog(null,"Hence the are of given triangle is "+area+" units\u00B2");

        JOptionPane.showMessageDialog(null,"Volume of cube with side 1 is "+ side1*side1*side1+" cubic units");
        JOptionPane.showMessageDialog(null,"Volume of cuboid is "+ side1*side2*side3+" cubic units");

        double sside = Double.parseDouble(JOptionPane.showInputDialog("Enter a length of square"));

        JOptionPane.showMessageDialog(null,"Area of square is "+ sside*sside+ "\nAnd, the perimeter is "+4*sside);
    }
}
