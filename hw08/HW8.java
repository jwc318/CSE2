//Joey Carney
//10/26/14
//hw08-HW8.java



import java.util.Scanner; //import statement for the scanner
public class HW8{ //public class declaration
    public static void main(String []arg){ //main method in every java program
	    char input; 
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	    input=getInput(scan,"Cc");
	    System.out.println("You entered '"+input+"'");
	    System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	    input=getInput(scan,"yYnN",5); //give up after 5 attempts
	    if(input!=' '){
   	        System.out.println("You entered '"+input+"'");
	    }
	    input=getInput(scan,"Choose a digit.","0123456789");
	    System.out.println("You entered '"+input+"'");
    }  
  
    public static char getInput(Scanner scan, String answer) { //getInput method with one scanner and one string
        char new_response = ' ';
      
        String response = scan.next(); //prompts user for input
      
          
      
        for(int i = 0; i <= answer.length(); i++) { //for loop to run through the string answer
            if((answer.charAt(0)) == response.charAt(i) || answer.charAt(1) == response.charAt(i)) {
                return response.charAt(i); //return response if response equals answer
            } else {
                while(!((answer.charAt(0)) == response.charAt(0) || answer.charAt(1) == response.charAt(0))) {
                    if(response.length() > 1) {//if response is greater than one
                        System.out.print("You should enter exactly one character- "); //tell user that response cannot be over 2 chars
                        response = scan.next(); //re-prompt the user for input
                         
                    } else {
                        System.out.print("You did not enter a character from the list '" + answer + "'; try again- "); //tell user that the response was wrong
                        response = scan.next(); //re-prompt the user for input
                       
                    }
                }
                char error_response = response.charAt(0);
              return error_response; //return the corrected response
            }
     
      
  }
    return new_response;
    }
    
  
    public static char getInput(Scanner scan, String answer, int tries) {
        for(int i = 0; i < tries; i++) { //loop for the amount of tries that the user has
            char response = scan.next().charAt(0); //response is the first letter of the input
            for(int j = 0; j < answer.length(); j++) {
                if(answer.charAt(j) == response) {
                    return response;
                }
            
            }
        System.out.print("You did not enter a character from the list 'yYnN'; try again- ");//tells user they did not have the correct input
        }
    System.out.println();
    System.out.println("You failed after " + tries + " times"); //tells the user they used too many tries
    return ' ';
    }
    
    
    
    public static char getInput(Scanner scan, String prompt, String answer) {
        boolean check = true;
        while(check) { //while the check is true, perform the following
            System.out.println(prompt);
            System.out.print("Enter one of:"); //prompts user for input
                for(int i = 0; i < answer.length(); i++) {
                     System.out.print("'" + answer.charAt(i) + "'");
                }
            System.out.print("-");
            String response = scan.next(); //lets user enter input
            if(response.length() >= 2) {
                System.out.println("Enter exactly one character"); //tells user that the input should be one char
            } else {
                for(int j = 0; j < answer.length(); j++) {
                    if(answer.charAt(j) == response.charAt(0)) {
                        check = false; //exits the while loop
                        System.out.println();
                        return response.charAt(0); //return the correct input
                    }
            
                }
            }
        }
        return ' ';
    }
}