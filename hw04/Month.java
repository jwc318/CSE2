//Joey Carney
//9/22/14
//hw04--month.java
//this program will read a user input for the month(represented by an int)
//and will print the number of days in the given month
 
import java.util.Scanner; // imports the scanner class
public class Month { // public class statement
    public static void main(String[] args) { //main method
        Scanner myScanner = new Scanner(System.in); // sets up scanner object
        System.out.print("Enter an int giving the number of the month (1-12): "); //prompts user to enter value 1-12
        int user_month = myScanner.nextInt(); // user enters a month number from 1-12
        if(user_month > 0 && user_month <= 12) {
            if(user_month == 1) { // if statements to determine which month was selected
                System.out.println("The month has 31 days");
            } else if(user_month == 2) { // if february, the special exception
                System.out.print("Enter an int giving the year: ");
                int year = myScanner.nextInt(); 
                if(year % 4 == 0) { //if the remainder of the year / 4 = 0, then year is a leap year
                    System.out.println("The month has 29 days");
                } else {
                    System.out.println("The month has 28 days");
                }
            } else if(user_month == 3) {
                System.out.println("The month has 31 days");
            } else if(user_month == 4) {
                System.out.println("The month has 30 days");
            } else if(user_month == 5) {
                System.out.println("The month has 31 days");
            } else if(user_month == 6) {
                System.out.println("The month has 30 days");
            } else if(user_month == 7) {
                System.out.println("The month has 31 days");
            } else if(user_month == 8) {
                System.out.println("The month has 31 days");
            } else if(user_month == 9) {
                System.out.println("The month has 30 days");
            } else if(user_month == 10) {
                System.out.println("The month has 31 days");
            } else if(user_month == 11) {
                System.out.println("The month has 30 days");
            } else {
                System.out.println("The month has 31 days");
            }
        } else {
            System.out.println("You did not enter an int between 1 and 12"); // exception statement
        }
    }
}
