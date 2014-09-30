//Joey Carney
//9/24/14
//Lab05--RandomGames
//This program will prompt the user for an input for a certain game

import java.util.Scanner;
public class RandomGames {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter R or r for Roulette, C or c for Craps, and P or p for pick a card: ");
        String response = myScanner.next();
        if(response.equals("C") || response.equals("c") || response.equals("P") || response.equals("p") || response.equals("R") || response.equals("r")) {
            if(response.equals("R") || response.equals("r")) {
                int R_random = (int) (Math.random() * 38) + 1;
                String R_result = "";
                switch (R_random) {
                    case 37 : R_result = "0";
                    break;
                    case 38 : R_result = "00";
                    break;
                    default : R_result = "" + R_random;
                    break;
                }
                System.out.println("Roulette: " + R_result);
        } else if(response.equals("C") || response.equals("c")){
            int roll_1 = (int) (Math.random() * 6) + 1;
            int roll_2 = (int) (Math.random() * 6) + 1;
            int sum = roll_1 + roll_2;
            System.out.println("Craps: " + roll_1 + " + " + roll_2 + " = " + sum);
            
        } else if(response.equals("P") || response.equals("p")) {
            int suit = (int) (Math.random() * 4) + 1;
            String suit_result = "";
            switch (suit) {
                case 1 : suit_result = "Hearts";
                break;
                case 2 : suit_result = "Diamonds";
                break;
                case 3 : suit_result = "Spades";
                break;
                case 4 : suit_result = "Clovers";
                break;
                default : System.out.println("Programmer error");
            }
            int number = (int) (Math.random() * 13) + 1;
            String number_result = "";
            switch (number) {
                case 1: number_result = "Two of ";
                break;
                case 2: number_result = "Three of ";
                break;
                case 3: number_result = "Four of ";
                break;
                case 4: number_result = "Five of ";
                break;
                case 5: number_result = "Six of ";
                break;
                case 6: number_result = "Seven of ";
                break;
                case 7: number_result = "Eight of ";
                break;
                case 8: number_result = "Nine of ";
                break;
                case 9: number_result = "Ten of ";
                break;
                case 10: number_result = "Jack of ";
                break;
                case 11: number_result = "Queen of ";
                break;
                case 12: number_result = "King of ";
                break;
                case 13: number_result = "Ace of ";
                break;
            }
            System.out.println(number_result + suit_result);
        }
            
        } else {
            System.out.println("You did not enter a valid response");
        }
    
    }
}