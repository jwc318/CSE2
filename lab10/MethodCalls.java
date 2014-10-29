//Joey Carney
//10/29/14
//lab10--MethodCalls.java

public class MethodCalls{ //public class declaration
    public static void main(String []  arg){ //main method in every java program
        int a=784,b=22,c; //declaring the variables
        c=addDigit(a,3); //call to the addDigit method
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5); //another call to the addDigit method
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3)); //the final call to the addDigit method
        c=join(a,b); //first call to the join method
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83))); //another call to the join method
        System.out.println("Join -9 and -90 to get "+join(-9,-90)); //final call to the join method
    }
    
    public static int addDigit(int a, int b) { //method declaration for the addDigit method with two parameters
        String StrA = "" + a; //form int a and int b into strings
        String StrB = "" + b;
        if(a<0) { //if a is negative, the only use from index 1 to the end of string a
            StrA = StrA.substring(1);
            String new_string = "-" + StrB + StrA; //new string would be both ints, with a negative sign in front
            int new_number = Integer.parseInt(new_string); //change string back into int
            return new_number; //return the int
        } else {
        String new_string = StrB + "" + StrA; //if the numbers are not negative, then just return the two ints in a string
        int new_number = Integer.parseInt(new_string); //change the string back to an int
        return new_number; //return the new int
        }
    }
    
    public static int join(int c, int d) { //method declaration for the method join
        String StrC = "" + c; //making both int c and int d into strings
        String StrD = "" + d;
        if(c < 0 && d < 0) { //if both are negative, then disregard the negative sign
            StrC = StrC.substring(1);
            StrD = StrD.substring(1);
            String new_string1 = "" + StrC + StrD;
            int new_number1 = Integer.parseInt(new_string1);
            return new_number1;
        } else {
            String new_string1 = "" + StrC + StrD;
            int new_number1 = Integer.parseInt(new_string1);
            return new_number1; //reformat the string into an int, and return that int
        }
    }
    
}  
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/