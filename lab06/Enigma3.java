/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }
    if(n*k%12< 12){
      n-=20;
      out+=n;
     
    }
    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
    }
    System.out.println(k);
    System.out.println(n);
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98:
          System.out.println("TEST");
        n/=5;
        k=k/9;
        System.out.println(k);
        break;
      default:
        n-=3;
        k-=5;
    }
    System.out.println(k);
     out+=1/n + 1/k;  
    System.out.println(out);
  }
}

/*
 * Error report:
 * In the if statement on line 20, i added a system.out.println statement to determine if n is equal to 0
 * I ran the program, and n was equal to zero in that if statement
 * 
 * 
 */
