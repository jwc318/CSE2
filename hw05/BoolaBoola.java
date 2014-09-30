//Joey Carney
//9/30/14
//hw05--BoolaBoola.java

import java.util.Scanner;
public class BoolaBoola {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int random1 = Math.random();
        int random2 = Math.random();
        int random3 = Math.random();
        boolean bool1;
        boolean bool2;
        boolean bool3;
        if(random1 > 0.5) {
            bool1 = true;
        } else {
            bool1 = false;
        }
        if(random2 > 0.5) {
            bool2 = true;
        } else {
            bool2 = false;
        }
        if(random3 > 0.5) {
            bool3 = true;
        } else {
            bool3 = false;
        }
        
        int random4 = Math.random();
        int random5 = Math.random();
        String op1;
        String op2;
        if(random4 > 0.5) {
            op1 = "and";
        } else {
            op1 = "or";
        }
        if(random5 > 0.5) {
            op2 = "and";
        } else {
            op2 = "or";
        }
        
        if(op1.equals('and') && op2.equals('and') {
            System.out.println("Does " + bool1 + " && " + bool2 + " && " + bool3 + " have the value true(T/t) or false(F/f)?
            char answer1 = myScanner.next().charAt(0);
            if(bool1 == true && bool2 == true && bool3 == true){
                System.out.println("Correct");
            } else if(bool1 == true && bool2 == true && bool3 == false) {
                System.out.println("Correct");
            }
                //I did not finish this homework problem because i am extremely lost.... Im not sure how I would
                //compute all 32 options
            }
            
        }
    }
}