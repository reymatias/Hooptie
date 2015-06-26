/**
 * Created by Reynante Matias on 6/26/2015.
 *
 * Recreated for GitHub and refactoring purposes.
 */

import java.util.Scanner;

public class Hooptie {
    public static void main(String[] args) {
        //declaration and initialization
        Scanner input = new Scanner(System.in);

        int n1=35, n2=65, n3=20, result=0, result1=0, result2=0, base, total;

        //asks for user input
        System.out.println("Available Cars: 1 for Econobox, 2 for Whip, 3 for Junker");
        System.out.print("Please select a rental car: ");
        int car = input.nextInt();

        System.out.print("Please enter how many days of rental: ");
        int rental = input.nextInt();

        System.out.print("Platinum Executive Package? 1 for yes, 0 for no? ");
        int PEP = input.nextInt();

        System.out.print("Are you a repeat customer? 1 for yes, 0 for no. ");
        int repeat = input.nextInt();
        System.out.println("");

        //checks user input and calculates
        base = (result * rental);
        if (car == 1){
            result = n1;
            base = (result * rental);
            System.out.print("Base: " + rental + " days for a Econobox @ $" + result + " per day:");
            System.out.println("          $" + base);
        } else if (car == 2){
            result = n2;
            base = (result * rental);
            System.out.print("Base: " + rental + " days for a Whip @ $" + result + " per day:");
            System.out.println("              $" + base);
        } else if (car == 3){
            result = n3;
            base = (result * rental);
            System.out.print("Base: " + rental + " days for a Junker @ $" + result + " per day:");
            System.out.println("            $" + base);
        }

        //if platinum executive package
        if (PEP == 1){
            result1 = ((int) (base * .1));
            System.out.print("Platinum Executive Package:");
            System.out.println("                         +$" + result1);
        } else {

        }

        //if repeat
        if (repeat == 1){
            result2 = ((int) (result * (rental/5)));
            System.out.print("Repeat Customer Discount:");
            System.out.println("                           -$" + result2);
        } else {

        }

        //print
        System.out.println("");
        total = ((base + result1) - result2);
        System.out.print("Total Estimate for Rental:");
        System.out.println("                           $" + total);
    }
}
