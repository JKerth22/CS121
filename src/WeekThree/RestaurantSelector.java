package WeekThree;
import javax.swing.JOptionPane;
public class RestaurantSelector {
    public static void main(String[] args) {
        Boolean vegetarian;
        Boolean vegan;
        Boolean glutenFree;
        String tempStr;
        tempStr = JOptionPane.showInputDialog("is Anyone in your party vegetarian?");
        if (tempStr.equals("yes")) {
            vegetarian = true;
        }
        else{
            vegetarian = false;
        }
        tempStr = JOptionPane.showInputDialog("is Anyone in your party vegan?");
        if (tempStr.equals("yes")) {
            vegan = true;
        }
        else{
            vegan = false;
        }
        tempStr = JOptionPane.showInputDialog("is Anyone in your party gluten free?");
        if (tempStr.equals("yes")) {
            glutenFree = true;
        }
        else{
            glutenFree = false;
        }
        System.out.println("Here are your restaurant choices: ");
        if (!vegetarian && !vegan && !glutenFree) {
            System.out.println("Joe's Gourmet Burgers");
        }
        if (!vegan) {
            System.out.println("Main Street Pizza Company");
        }
        System.out.println("Corner Cafe");
        if (!vegan && !glutenFree) {
            System.out.println("Mama's Fine Italian");
        }
        System.out.println("The Chef's Kitchen");
    }
}
