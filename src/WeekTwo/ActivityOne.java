package WeekTwo;
import javax.swing.JOptionPane;
import java.util.Scanner;

//Scanner

public class ActivityOne {
    public static void main(String[] args) {
        //P Principle Amount r rate n number of times per year t specified number of years a amount of money after
        double P, r, A;
        int n,t;

        //prompt user
        //sout
        System.out.println("Enter in the principal amount: ");
        //Make scanner object
        Scanner scn = new Scanner(System.in);
        P = Double.parseDouble(scn.nextLine());
        System.out.println("Enter in the annual interest rate: ");
        r = Double.parseDouble(scn.nextLine());
        System.out.println("Enter in the number of times interest is applied per year: ");
        n = Integer.parseInt(scn.nextLine());
        System.out.println("Enter in the number of years: ");
        t = Integer.parseInt(scn.nextLine());
        A = P * Math.pow((1 + r/n), t * n);
        //%s string
        //%f floats --> %.2f 5.334 5.33
        //%d integers
        //%c characters
        System.out.printf("The outcome of the equation is: $ %.2f", A);
        P = Double.parseDouble(JOptionPane.showInputDialog("Enter the principal amount"));
        r = Double.parseDouble(JOptionPane.showInputDialog("Enter in the annual interest rate: "));
        n = Integer.parseInt(JOptionPane.showInputDialog("Enter in the number of times interest is applied per year: "));
        t = Integer.parseInt(JOptionPane.showInputDialog("Enter in the number of years: "));
        A = P * Math.pow((1 + r / n), t * n);
        //%s string
        //%f floats --> %.2f 5.334 5.33
        //%d integers
        //%c characters
        System.out.printf("The outcome of the equation is: $ %.2f", A);
        JOptionPane.showMessageDialog(null, String.format("The balance" + "of the account after %d years will be: $ %.2f", t, A));
    }

}
