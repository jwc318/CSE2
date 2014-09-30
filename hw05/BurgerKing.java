//Joey Carney
//9/30/14
//hw05--BurgerKing.java
//This program prompts the user for a choice of a burger, soda, or fries and has different options for each selection
import java.util.Scanner; // import statement
public class BurgerKing { // public class declaration
    public static void main(String[] args) { // main method
        Scanner myScanner = new Scanner(System.in); //creates a scanner
        System.out.println("Enter a letter to indicate the choice of: "); //prompts user for input
        System.out.println("Burger (B or b) ");
        System.out.println("Soda (S or s) ");
        System.out.println("Fries (F or f) ");
        char choice = myScanner.next().charAt(0); // takes user input for a char
        //this program does not need a statement for when the user enters a value which is more than one character, since my choice
        //prompt is reading the next whole token, but only taking the first letter. 
        
        
        
        
        
                  if(choice == 'B' || choice == 'b'){ //if the user inputs a choice for burger
                      System.out.println("Enter A or a for 'all the fixins' "); //prompts user for input
                      System.out.println("C or c for cheese ");
                      System.out.println("N or n for all of the above");
                      char B_choice = myScanner.next().charAt(0);
                      if(B_choice == 'A' || B_choice == 'a') {
                          System.out.println("You ordered a burger with all of the toppings");
                      } else if(B_choice == 'C' || B_choice == 'c') {
                          System.out.println("You ordered a burger with cheese");
                      } else if(B_choice == 'N' || B_choice == 'n') {
                          System.out.println("You ordered a regular hamburger");
                      } else {
                          System.out.println("You did not enter a valid burger selection");
                      }
                  } else if(choice == 's' || choice == 'S') { //if the user inputs a choice for soda
                      System.out.println("Would you like a Pepsi (P or p), Coke (C or c), Sprite(S or s) or Mountain Dew(M or m)?");
                      char S_choice = myScanner.next().charAt(0);
                      if(S_choice == 'P' || S_choice == 'p') {
                          System.out.println("You ordered a Pepsi");
                      } else if(S_choice == 'C' || S_choice == 'c') {
                          System.out.println("You ordered a Coke");
                      } else if(S_choice == 'S' || S_choice == 's') {
                          System.out.println("You ordered a Sprite");
                      } else if(S_choice == 'M' || S_choice == 'm') {
                          System.out.println("You ordered a Mountain Dew");
                      } else {
                          System.out.println("You did not enter a valid soda selection");
                      }
                  } else if(choice == 'f' || choice == 'F') { //if the user inputs a choice for fries
                      System.out.println("Would you like a small(s or S) or large(l or L) order of fries?");
                      char F_choice = myScanner.next().charAt(0);
                      if(F_choice == 's' || F_choice == 'S') {
                          System.out.println("You ordered small fries");
                      } else if(F_choice == 'l' || F_choice == 'L') {
                          System.out.println("You ordered large fries");
                      } else {
                          System.out.println("You did not enter a valid fries selection");
                      }
                  } else { // tells the user that they did not enter a valid selection
                      System.out.println("You did not enter any of B, b, S, s, F, or f");
                  }
        
                          
        
    }
}