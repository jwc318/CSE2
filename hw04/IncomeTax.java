//Joey Carney
//9/22/14
//hw04--IncomeTax
//this program will read an int which is the number of thousands of dollars of income
//and will write the amount of tax placed on this amount of income

import java.util.Scanner; //imports the scanner class
public class IncomeTax { //public class statement
    public static void main(String[] args) { //main method
        Scanner myScanner = new Scanner(System.in); // create scanner object
        double taxRate;
        System.out.print("Enter an int giving the number of thousands: "); // request int from user
        int money = myScanner.nextInt(); //scans next int
        if(money >= 0) { // if statements to determine what tax rate should be implemented
            if(money < 20) {
                taxRate = 0.05;
            } else if (money < 40) {
                taxRate = 0.07;
            } else if (money < 78) {
                taxRate = 0.12;
            } else {
                taxRate = 0.14;
            }
            //prints out the amount of money, tax rate, and what the total tax is
            System.out.println("The tax rate on $" + (money*1000) + " is " + (taxRate*100) + "%, and the tax is $" + (money * 1000 * taxRate));
        } else {
            System.out.println("You did not enter an int"); // exception statement
        }
    }
}