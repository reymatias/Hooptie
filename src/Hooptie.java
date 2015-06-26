/**
 * Created by Reynante Matias on 6/26/2015.
 *
 * Recreated for GitHub and refactoring purposes.
 */

import java.util.Scanner;
import java.lang.String;

public class Hooptie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = "";
        int price = 0, withPep = 0, ifRepeat = 0, base, total;

        System.out.println("Available Cars: 1 for Econobox, 2 for Whip, 3 for Junker");
        System.out.print("Please select a rental car: ");
        int car = input.nextInt();

        System.out.print("Please enter how many days of rental: ");
        int days = input.nextInt();

        System.out.print("Platinum Executive Package? 1 for yes, 0 for no? ");
        int pep = input.nextInt();

        System.out.print("Are you a repeat customer? 1 for yes, 0 for no. ");
        int repeat = input.nextInt();
        System.out.println("\n");

        if (car == 1) {
            price = 35;
            name = "Econobox";
        } else if (car == 2) {
            price = 65;
            name = "Whip";
        } else if (car == 3) {
            price = 20;
            name = "Junker";
        }

        base = (price * days);

        System.out.print("Base: " + days + " days for a " + name + " @ $" + price + " per day:");
        System.out.println("\t$" + base);

        if (pep == 1) {
            withPep = ((int) (base * .1));
            System.out.print("Platinum Executive Package:");
            System.out.println("\t\t\t\t\t$" + withPep);
        }

        if (repeat == 1) {
            ifRepeat = price * (days/5);
            System.out.print("Repeat Customer Discount:");
            System.out.println("\t\t\t\t\t-$" + ifRepeat);
        }

        System.out.println("");
        total = ((base + withPep) - ifRepeat);
        System.out.print("Total Estimate for Rental:");
        System.out.println("\t\t\t\t\t$" + total);
    }
}
