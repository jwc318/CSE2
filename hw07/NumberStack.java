//Joey Carney
//10/20/14
//hw07--NumberStack.java

import java.util.Scanner;
public class NumberStack {//class declaration
    public static void main(String[] args) { //main method in every java program
        Scanner input = new Scanner(System.in); //scanner statement
        System.out.print("Enter a number between 1 and 9: "); //prompts user for an integer value
        if(input.hasNextInt()) { //checks if the user entered an int
        int number = input.nextInt();//takes the value if the user entered an int
        //This portion of the code deals with FOR loops:
        for(int i = 1; i <= number; i++) { //for loop section:
            for(int j = 1; j <= i; j++) {
                for(int k = 1; k <=(i*4) - 2; k+=2) {
                    System.out.print(i);
                }
                
                System.out.println(); 
                
            }
          System.out.println("-");
        }
        
                  System.out.println(); //spacing between sections
                  System.out.println();
        
        
        
        //This portion of the code deals with WHILE loops:
        int p=1, q=1, r=1;
        while(p <= number) {
            while(q<= p) {
                while(r<=((p*4)-2)) {
                    System.out.print(p);
                    r+=2;
                }
            System.out.println();
            q++;
            r=1;
            }
            System.out.println("-");
            p++;
            
            q=1;
            r=1;
        }
        
        System.out.println();
        System.out.println();
        //This portion of the code deals with DO WHILE loops:
        /*
        int s=1, t=1, u=1;
        do{
            System.out.print(s);
            u+=2;
           
            
            
            
            do{
                System.out.println();
                t++;
                u=1;
               
                
                do{
                    System.out.println("-");
                    s++;
                    t=1;
                    u=1;
                }while(s<=number);
            }while(t<=s);
        }while(u<=(s*4)-2);
        */
        
        }else {
            System.out.println("You did not enter a valid integer"); //tells user the input is bad
        }
    }
}


//The for and while loop portion of this homework worked well, but the do while loop kept resulting
//in an infinite loop, so i commented that section out of the code. 