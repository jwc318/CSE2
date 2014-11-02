//Joey Carney
//11/1/14
//hw09--BlockedAgain

import java.util.Scanner; //import the scanner statement
public class BlockedAgain{ //public class statement
    public static void main(String []s){ //main method
    int m;
    //force user to enter int in range 1-9, inclusive.
    m = getInt();  //calls the getInt method
    allBlocks(m); //calls the allBlocks method
    }
    
    public static int getInt() { //getInt method
        Scanner scan = new Scanner(System.in); //sets up the scanner
        System.out.print("Enter an integer value that is between 1 and 9: "); //prompts user for input
        String response = scan.next(); //accepts user input
        String error_response;
        if(checkInt(scan, response) == true && checkRange(scan, response) == true) {
            return Integer.parseInt(response); //if both checks are true, return the int form of the string
        } else {
            do {
                error_response = scan.next(); //else, make user enter another response
            } while(!((checkInt(scan, error_response)) && (checkRange(scan, error_response)))); //while these checks are false....
        }
        return Integer.parseInt(error_response);  //return int version of error response as value
    }
    
    public static boolean checkInt(Scanner scan, String response) { //method to check if input is an integer
        try { //try-catch statemet, basically try to change response to an int, if not return false
            Integer.parseInt(response);
        } catch (NumberFormatException e) {
            System.out.print("You did not enter a valid integer, please try again:");
            return false;
        }
        return true;
    }
    
    public static boolean checkRange(Scanner scan, String response) { //method to check if int is in [1,9]
        boolean check = true;
        try { //same try-catch statement in checkInt method
            Integer.parseInt(response);
        } catch (NumberFormatException e) {
            check = false;
            return false;
        }
        if(check = true) {
            if(Integer.parseInt(response) >= 1 && Integer.parseInt(response) <= 9) {
                return true; //if value is between 1 and 9 then return true
            } else {
                System.out.print("You did not enter an int in [1,9]; try again:");
                return false; //else return false, and tell user
            }
        } else {
            return false;
        }
    }
    
    public static void allBlocks(int m) { //method for allBlocks
        for(int i = 1; i <= m; i++) {
        block(m, i); //makes individual blocks of 1 to int m
        }
    }
    
    public static void block(int sections, int block) { //makes the sections for the blocks
        for(int j = 1; j <= block; j++) {
        line(sections, block, j);
        }
        int spaces = sections - block;
        for(int p = 0; p < spaces; p++) {
            System.out.print(" ");
        }
        for(int q = 0; q < block*4 - 2; q+=2) {
            System.out.print("-");
        }
        for(int r = 0; r < spaces; r++) {
            System.out.print(" ");
        }
        System.out.println();
    }
    
    public static void line(int sections, int block, int line) { //makes each line for each section
        int spaces = sections - block;
        for(int l = 0; l < spaces; l++) {
            System.out.print(" ");
        }
        for(int m = 1; m <=(block*4) - 2; m+=2) {
            System.out.print(block);
        }
        for(int n = 0; n < spaces; n++) {
            System.out.print(" ");
        }
        System.out.println();
    }
}