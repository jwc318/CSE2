//Joey Carney
//10/14/14
//hw06-Root.java
import java.util.Scanner; //import scanner statement
public class Root { //public class statement
    public static void main(String[] args) { //main method in every java program
        Scanner myScanner = new Scanner(System.in); //scanner statement
        System.out.println("Please enter a double that is greater than zero, and the root will be displayed");
        double x = myScanner.nextDouble(); //user enters a value for x, and the root will be computed
        double low = 0.0;
        double high = 1 + x;
        double middle = (low + high) / 2;
        if(x <= 0) {
            System.out.println("That is invalid input, please try again");
            return;
        } else {
            
        
        
        while((high - low) > ((1+x) * 0.0000001)) { //checks test condition
        if((middle*middle) > x) {
            high = middle;
            middle = (high+low) / 2;
        }else {
            low = middle;
            middle = (high+low) / 2;
      
        }
        }
        }
        System.out.println("The root of the number entered is:" + high); //prints out the root of the number x
    }
}