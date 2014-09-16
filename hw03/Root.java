//Joey Carney
//HW03-Root
//9/15/14
//This program will read a double, and try to compute the cube root

import java.util.Scanner; // imports Scanner class
public class Root { // defines public class Root
    public static void main(String[] args) { // defines main method
        Scanner in = new Scanner(System.in); // Scanner object
        System.out.print("Enter a double, and the cube root will be printed: "); // prompts the user for a double
        double value = in.nextDouble(); // reads the double that is entered
        System.out.println(""); // skips line
        //refines the guess 6 times
        double guess = value / 3;
        double improved_guess1 = (2 * guess * guess * guess + value) / (3 * guess * guess);
        double improved_guess2 = (2 * improved_guess1 * improved_guess1 * improved_guess1 + value) / (3 * improved_guess1 * improved_guess1);
        double improved_guess3 = (2 * improved_guess2 * improved_guess2 * improved_guess2 + value) / (3 * improved_guess2 * improved_guess2);
        double improved_guess4 = (2 * improved_guess3 * improved_guess3 * improved_guess3 + value) / (3 * improved_guess3 * improved_guess3);
        double improved_guess5 = (2 * improved_guess4 * improved_guess4 * improved_guess4 + value) / (3 * improved_guess4 * improved_guess4);
        System.out.println("The cube root is " + improved_guess5); // prints the guess
        double calculated_value = (improved_guess5 * improved_guess5 * improved_guess5); // calculates the original value
        System.out.println(improved_guess5 + "*" + improved_guess5 + "*" + improved_guess5 + "=");
        System.out.println(calculated_value);
        //prints the original value
        
    }
}
