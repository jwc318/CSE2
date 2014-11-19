//Joey Carney
//11/17/14
//hw10--PokerOdds

//As of now, my program does not compile and or run. I was a bit pressed on time, and was not able to try simulateOdds(), but 
//I was able to start showHands(). The compiler said that my type array was not being processed correctly, but I could not figure out
//what the problem was. 
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
  
  public static void showHands {
      Scanner scan = new Scanner(System.in);
      String cards[] = new String[5];
      char type = new char[13];
      int clubs = 0;
      int diamonds = 0;
      int spades = 0;
      int hearts = 0;
      int deck[] = new int[52];
      for(int i = 0; i < deck.length; i++) {
          deck[i] = i;
      } 
      int hand[] = new int[5];
      for(int j = 0; j < hand.length; j++) {
          hand[j] = -1;
      }
      for(int k = 0; k <= 4; k++) {
      int draw = (int)(Math.random * 51);
      for(int p = draw; p < deck.length; p++) {
          deck[p] = deck[p+1];
      }
      deck[(deck.length - 1) - k] = -1; 
      hand[k] = draw;
      
      }
      for(int m = 0; m < hand.length; m++) {
          for(int i = 0; i < deck.length; i++) {
              type = {'A', 'K', 'Q', 'J', '10', '9', '8','7', '6', '5', '4', '3', '2'};
              for(int b = 0; b < type.length; b++) {
              if(((hand[m] / 13) == 0) && ((hand[m] % 13) == b)) {
                  System.out.print("Clubs:  " + type[b]);
              } else if(((hand[m] / 13) == 1) && ((hand[m] % 13) == b)) {
                  System.out.print("Diamonds:  " + type[b]);
              } else if(((hand[m] / 13) == 2) && ((hand[m] % 13) == b)) {
                  System.out.print("Hearts:  " + type[b]);
              } else {
                  System.out.print("Spades:  " + type[b]);
              }
              
              
          }
      }
      
  }
}
}
