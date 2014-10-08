//Joey Carney
//9/8/14
//lab07-looptheloop

import java.util.Scanner; //import statement
public class LoopTheLoop { //make a public class
    public static void main(String[] args) { //main method for every java program
        Scanner myScanner = new Scanner(System.in); //make a scanner statement
        while(true) { //while the whole code is true, execute the following
            
        System.out.println("Enter an int between 1 and 15: "); //prompt the user for an input between 1 and 15
        if(myScanner.hasNextInt()) { //if the user has an int to enter
            int nStars = myScanner.nextInt(); //nStars is equal to the next int that the user inputs
            if(nStars >= 1 && nStars <= 15) { 
                int counter = 1;
                for(int i = 0; i < nStars; i++) { //for loop to produce the first line of stars
                    System.out.print("*");
                }
                System.out.println();
                while (counter <= nStars) {
                    for(int i = 0; i < counter; i++) { //for loop to produce the next nStars lines of output
                        System.out.print("*");
                    }
                    System.out.println();
                    counter++;
                }
            } else {
                System.out.println("Your int was not in the range from 1 to 15"); //exception when the int was not in the range
            } 
        } else {
            System.out.println("You have not entered a valid int value"); // When the user does not even enter an int
            
        }
        System.out.println("Enter y or Y if you want to continue"); //prompts the user to continue the program or not
        String answer = myScanner.next();
        
        if((answer.equals("Y")) || (answer.equals("y"))) { // if the answer is y or Y, then re enter the loop
            System.out.println("You have re-entered the loop");
        } else { //if the answer is not y or Y, then break from the loop
        break;
        }
        }
    }
}