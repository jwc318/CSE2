import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+="13";
      case 40: out+="40/0";
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * 
 * Since "out" is a string, you cannot add an integer value to the value out.
 To fix this problem, I made the values of 13 and 40/0 into strings, so that when the 
 * switch statement is executed, it adds a string value to out instead of an int value
 * 
 * 
 */
