//Joey Carney
//12/1/14
//hw11--PokerHands
//This program will determine what kind of reward should be given to a user-entered five card poker hand. 

import java.util.Scanner; //import scanner statement
public class PokerHands { //public class declaration
    public static void main(String[] args) { //main method
        Scanner scan = new Scanner(System.in); //makes a scanner 
        boolean check = true;
        while(check) { //while the user presses y or Y...
        int[] hand = new int[5]; //makes a new array of length 5
        System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- "); //prompts the user to continue playing
        char response = scan.nextLine().charAt(0);
        if((response == 'y') || (response == 'Y')) {
            for(int i = 0; i < 5; i++) {
                System.out.print("Enter a suit: 'c', 'd', 'h', 's'- "); //prompts the user for a choice of suit
                char suit_answer = scan.nextLine().charAt(0);
                if(!((suit_answer == 'c') || (suit_answer == 'd') || (suit_answer == 'h') || (suit_answer == 's'))) {
                    System.out.println("You did not enter a valid card"); //error statement
                    i--;
                }
                if(suit_answer == 'd') {
                    hand[i] += 13; //if diamonds is chosen, start at index 13
                } else if(suit_answer == 'h') {
                    hand[i] += 26; //if hearts is chosen, start at index 26
                } else if(suit_answer == 's') {
                    hand[i] += 39; //if spades is chosen, start at index 39
                }
                System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ... '2'- "); //prompts the user for a choice of rank
                String rank_answer = scan.nextLine();
                if(rank_answer.equals("a")) {
                    hand[i] += 0;
                } else if(rank_answer.equals("k")) {
                    hand[i] += 1;
                } else if(rank_answer.equals("q")) {
                    hand[i] += 2;
                } else if(rank_answer.equals("j")) {
                    hand[i] += 3;
                } else if(rank_answer.equals("10")) {
                    hand[i] += 4;
                } else if(rank_answer.equals("9")) {
                    hand[i] += 5;
                } else if(rank_answer.equals("8")) {
                    hand[i] += 6;
                } else if(rank_answer.equals("7")) {
                    hand[i] += 7;
                } else if(rank_answer.equals("6")) {
                    hand[i] += 8;
                } else if(rank_answer.equals("5")) {
                    hand[i] += 9;
                } else if(rank_answer.equals("4")) {
                    hand[i] += 10;
                } else if(rank_answer.equals("3")) {
                    hand[i] += 11;
                } else if(rank_answer.equals("2")) {
                    hand[i] += 12;
                } else {
                    System.out.println("You did not enter a valid rank");
                }
                if(i>=1) {
                    if(hand[i] == hand[i-1]) {
                        System.out.println("You have already entered this card, enter a new card"); //error message
                        i--;
                    }
                }
            }
            System.out.println();
            showOneHand(hand);
            getReward(hand);
            
            
        } else {
            System.out.println("---------------");
            check = false;
        }
    }
    }
    
    //the showOneHand method will make two arrays, one with string representations of the suits and another
    //for the ranks. This method will show the suit, and whichever card of that suit is chosen to the console. 
    public static void showOneHand(int hand[]) {
        String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ","Spades:   "};
	    String face[]={ "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ", "4 ","3 ","2 "};
	    String out="";
	    for(int s=0;s<4;s++){
  	    out+=suit[s];
  	        for(int rank=0;rank<13;rank++) {
    	        for(int card=0;card<5;card++) {
     	            if(hand[card]/13==s && hand[card]%13==rank) {
      	                out+=face[rank];
     	            }
	            }
            }
            out+='\n';
        }
        System.out.println(out);
    }
    
    //The getReward method will determind what kind of hand you chose, and what reward it would be 
    //equivalent to in poker. 
    public static void getReward(int hand[]) {
        int Kind_count = 0;
        int counter = 0;
        int[] rank_frequences = new int[13];
        int[] suit_frequences = new int[5];
        String reward = "";
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 13; j++) {
                if((hand[i] % 13) == j) {
                    rank_frequences[j]++;
                }
            }
            for(int k = 0; k < 5; k++) {
                if((hand[i] / 13) == k) {
                    suit_frequences[k]++;
                }
            }
            
        }
        int[] composition = new int[5];
        for(int m = 0; m < 13; m++) {
            for(int n = 0; n < 5; n++) {
                if((rank_frequences[m] == n)) {
                    composition[n]++;
                }
            }
        }
        for(int q = 0; q < 5; q++) {
            if(composition[q] == 5) {
                for(int b = 0; b < 12; b++) {
                    if((rank_frequences[b] == 0) && (rank_frequences[b+1] == 1)) {
                        counter++;
                    }
                }
            }
        }
        if(counter == 1) {
            reward = "Straight";
        } else {
            reward = "High Card";
        }
        for(int l = 0; l < 13; l++) {
            if(rank_frequences[l] == 4) {
                reward = "Four of a Kind";
            } else if((rank_frequences[l] == 2)) {
                Kind_count++;
            }
        }
        if(Kind_count == 2) {
                reward = "Two pair";
            } else if(Kind_count == 1) {
                reward = "A pair";
            }
        if((composition[2] == 1) && (composition[3] == 1)) {
            reward = "Full House";
        }
        for(int q = 0; q < 4; q++) {
            int RF_count = 0;
            int SF_count = 0;
            if(suit_frequences[q] == 5)  {
                for(int u = 0; u < 5; u++) {
                    if(rank_frequences[u] == 1) {
                        RF_count++;
                    }
                }
                if(RF_count == 5) {
                    reward = "Royal Flush";
                } else {
                    for(int b = 0; b < 12; b++) {
                        if((rank_frequences[b] == 1) && (rank_frequences[b+1] == 1)) {
                            SF_count++;
                        }
                    }
                    if(SF_count == 4) {
                        reward = "Straight Flush";
                    } else {
                        reward = "Flush";
                    } 
                    
                }
            }
        }
        
           
           
        System.out.println("This is a " + reward);
    }
    
}