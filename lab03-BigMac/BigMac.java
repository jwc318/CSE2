//my name is Joey Carney
//The date is 9/10/14
//Lab03-BigMac
//This program will compute the costs of Big Macs, 

import java.util.Scanner;
//Create a public class called Big Mac
public class BigMac {
    //Create the main method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print("Enter the number of Big Macs(an integer >0): ");
        int nBigMacs = myScanner.nextInt();
        System.out.print("Enter the cost per Big Mac as a double (in the form xx.xx): ");
        double BigMac$ = myScanner.nextDouble();
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate /= 100; //changes the percent entered by user to a proportion
        double cost$;
        int dollars, dimes, pennies;
        cost$ = nBigMacs * BigMac$ * (1+taxRate);
        //to get a whole number amount change cost$ to an int
        dollars = (int) cost$;
        dimes = (int) (cost$ * 10) % 10;
        pennies = (int) (cost$ * 100) % 10;
        System.out.println("The total cost of " + nBigMacs + " BigMacs, at $" + BigMac$ + " per BigMac, with a sales tax of " + (int) (taxRate * 100) + "%, is $" + dollars + "." + dimes + pennies);
        
    }
}