//Joey Carney
//HW03-FourDigits
//9/15/14
//This program will use a double and print out the first four digits right of the decimal place

import java.util.Scanner;
public class FourDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a double, and the first four decimal places will be printed: ");
        double number = in.nextDouble();
        System.out.println("");
        int number2 = (int) (number * 10000);
        int number3 = (int) (number2 - ((int) number) * 10000);
        System.out.println("The four digits are " + number3);
    }
}