//Joey Carney
//10/22/14
//lab09-methods.java

import java.util.Scanner; //import scanner statement
public class Methods{ //class declaration
  public static void main(String [] args){ //main method in every java program
	Scanner scan=new Scanner(System.in); //sets up the scanner
	int a,b,c;
	System.out.println("Enter three ints"); //prompts the user for input
	System.out.print("Enter an int: ");
	if(scan.hasNextInt()) { //I made three if statements to check if the user is inputting integers
	a=getInt(scan);
	} else {
	    while(!scan.hasNextInt()) { //if they are not entering ints, then enter a while loop until they do
	    scan.next();
	    System.out.print("You did not enter an integer, please try again: ");
	    }
	    
	    a=getInt(scan);
	}
	System.out.print("Enter an int: ");
	if(scan.hasNextInt()) {
	    
	b=getInt(scan);
	} else {
	    while(!scan.hasNextInt()) {
	    scan.next();
	    System.out.print("You did not enter an integer, please try again: ");
	    }
	    
	    b=getInt(scan);
	}
	System.out.print("Enter an int: ");
	if(scan.hasNextInt()) {
	    
	c=getInt(scan);
	} else {
	    while(!scan.hasNextInt()) {
	    scan.next();
	    System.out.print("You did not enter an integer, please try again: ");
	    }
	    
	    c=getInt(scan);
	}

	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b)); //system.out.println statements from the lab
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
	
	}
	
	public static int getInt(Scanner scan) { //method for getInt, where the scanner reads the user input and saves it if the input is an int
	    int value = scan.nextInt();
	    return value;
	}
	public static int larger(int a, int b) { //method for larger, where if a is larger than b, return a and vice versa
	    if(a > b) {
	        return a;
	    } else if(a < b) {
	        return b;
	    } else {
	        return a;
	    }
	}
	
	public static boolean ascending(int a, int b, int c) { //method for ascending, if a is less than be and c, and b is less than c, then series is ascending.
	    if((a < b && a < c) && (b<c)) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
  }
  