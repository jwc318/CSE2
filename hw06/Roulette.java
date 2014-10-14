//Joey Carney
//hw06-Roulette.java
//10/14/14
//This program will take a randomly generated number, and see how many times, out of 100 spins, I will make a profit and how many
//times I will not win any money. I will run that code 1000 times, and see what my total winnings are
public class Roulette { //initializes the class
    public static void main(String[] args) { //main method in every java program
        int number = (int) (Math.random() * 100); //random number from 1-100 for my selection
        double winnings = 0.0;
        int no_winnings = 0; //initilizes four variables to zero
        int profit_win = 0;
        double total_winnings = 0.0;
        
        for(int j = 0; j < 1000; j++) { //for the 1000 times i will play roulette
            
        
        for(int i = 0; i < 100; i++) { //for the 100 spins per game
            int Roulette = (int) (Math.random() * 100); //the roulette selection for each spin
            if(number == Roulette) {
                winnings += 36.0;
            } else {
                winnings += 0.0;
        }
        if(winnings == 0.0) {
            no_winnings += 1;
        }
        if(winnings > 100) {
            profit_win += 1;
        }
        
        }
        
    }
    System.out.println("Your winnings for the 100,000 spins are: " + winnings); //total winnings
    System.out.println("The amount of times you lose everything is: " + no_winnings); //amount of times that I won nothing
    System.out.println("The amount of times you left with a profit was : " + profit_win); //amount of times I had a profit
}
}