
package storeprice;

/**
 * Dennys Miranda
 * 04-09-20
 * @author dennysmiranda
 */
import java.util.Scanner;

public class StorePrice {

    public static void main(String[] args) {
        // Create a scanner
        Scanner keyboard = new Scanner(System.in);

        // Declare variables
        double item1 = 0.0, item2 = 0.0;
        double item3 = 0.0, item4 = 0.0;
        double item5 = 0.0;

        double totalPrice = 0.0, subTotal = 0.0;
        double salesTax = 0.0;

        // Get input
        System.out.print("What is the price for item 1? $");
        item1 = keyboard.nextDouble();
        System.out.print("What is the price for item 2? $");
        item2 = keyboard.nextDouble();
        System.out.print("What is the price for item 3? $");
        item3 = keyboard.nextDouble();
        System.out.print("What is the price for item 4? $");
        item4 = keyboard.nextDouble();
        System.out.print("What is the price for item 5? $");
        item5 = keyboard.nextDouble();

        // calulations
        subTotal = item1 + item2 + item3 + item4 + item5;
        salesTax = subTotal * 0.06;
        totalPrice = subTotal + salesTax;

        // Get Output
        System.out.println("Your subtotal is $" + subTotal);
        System.out.println("Your sales tax is $" + salesTax + " (6%)");
        System.out.println("Your total price is $" + totalPrice);
    }

}
