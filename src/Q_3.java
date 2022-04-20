import javax.swing.*;

public class Q_3 {
    public static void main(String[] args) {
        float sub1 = Float.parseFloat(JOptionPane.showInputDialog("Enter the marks of sub1"));
        float sub2 = Float.parseFloat(JOptionPane.showInputDialog("Enter the marks of sub2"));
        float sub3 = Float.parseFloat(JOptionPane.showInputDialog("Enter the marks of sub3"));
        float sub4 = Float.parseFloat(JOptionPane.showInputDialog("Enter the marks of sub4"));


        float total = sub1+sub2+sub3+sub4;
        float percentage = total/400 *100;
        String result;

        result =  (percentage>=70)?"First class": (percentage>=59)? "upper second class": (percentage>=49)? "second class": (percentage>39)? "Third class":"Fail";
        JOptionPane.showMessageDialog(null,"Hey, your result is "+result);
    }
}
