//Joey Carney
//9/17/14
//CSE 002 -- lab04-BigMacAgain
//This program will scan a number of big macs, whether or not they want fries, and prints out total cost


import java.util.Scanner;
public class BigMacAgain {
    //main method in every java program
    public static void main(String[] args) {
        double cost_BM;
        double cost_FF;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number of BigMacs: ");
        if(myScanner.hasNextInt()) {
            int num_BigMacs = myScanner.nextInt();
            if(num_BigMacs > 0) {
                cost_BM = num_BigMacs * 2.22;
            } else {
                System.out.println("You entered a negative number for the amount of burgers");
                return;
            }
        } else {
            System.out.println("You did not enter an integer");
            return;
        }
        System.out.println("Do you want fries?");
        String answer = myScanner.next();
        if(answer.equals("Y") || answer.equals("y") || answer.equals("N") || answer.equals("n")) {
            if(answer.equals("Y") || answer.equals("y")) {
                cost_FF = 2.15;
            } else {
                cost_FF = 0;
            }
        } else {
            System.out.println("You have entered an invalid answer");
            return;
        }
        
        double totalCost = cost_BM + cost_FF;
        System.out.printf("The total cost of the meal is %.2f \n", totalCost);
        
        
    }
}

    
