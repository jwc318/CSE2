//Joey Carney
//9/22/14
//hw04--TimePadding
//This program will have the user enter a int giving the number of seconds that have 
//passed during a certain day, and display the time in conventional form

import java.util.Scanner; //import scanner class
public class TimePadding { //public class statement
    public static void main(String[] args) { //main method declaration
        Scanner myScanner = new Scanner(System.in); //sets up the scanner
        System.out.println("Enter the time in seconds: "); //prompts user for input
        int seconds = myScanner.nextInt(); //requires user to enter an int
        if(seconds > 0) { //if statments to determine the amount of time entered
            if(seconds < 10) {
                int time_seconds = seconds;
                String time = "0:00:0" + time_seconds;
                System.out.println("The time is " + time);
            } else if (seconds < 60) {
                int time_seconds = seconds;
                String time = "0:00:" + time_seconds;
                System.out.println("The time is " + time);
            } else if (seconds < 3600) {
                int time_minutes = seconds/60;
                int time_seconds = seconds % 60;
                if(time_minutes < 10) {
                    if(time_seconds < 10) {
                        String time = "0:0" + time_minutes + ":0" + time_seconds;
                        System.out.println("The time is " + time);
                    } else {
                        String time = "0:0" + time_minutes + ":" + time_seconds;
                        System.out.println("The time is " + time);
                    }
                } else {
                    if(time_seconds < 10) {
                        String time = "0:" + time_minutes + ":0" + time_seconds;
                        System.out.println("The time is " + time);
                    } else {
                    String time = "0:" + time_minutes + ":" + time_seconds;
                    System.out.println("The time is " + time);
                }
                }
                
            } else if (seconds < 86400) {
                int time_hours = (seconds/60) /60;
                int time_minutes = (seconds / 60) % 60;
                int time_seconds = (seconds % 60) % 60;
                if(time_minutes < 10) {
                    if(time_seconds < 10) {
                        String time = time_hours + ":0" + time_minutes + ":0" + time_seconds;
                        System.out.println("The time is " + time);
                    } else {
                        String time = time_hours + ":0" + time_minutes + ":" + time_seconds;
                        System.out.println("The time is " + time);
                    }
                } else {
                    if(time_seconds < 10) {
                        String time = time_hours + ":" + time_minutes + ":0" + time_seconds;
                        System.out.println("The time is " + time);
                    } else {
                    String time = time_hours + ":" + time_minutes + ":" + time_seconds;
                    System.out.println("The time is " + time);
                }
                }
                
            } else {
                System.out.println("The amount of time you entered exceeded a full day!"); //exception statement
            }
        } else {
            System.out.println("You did not enter a positive value for seconds"); // exception statement
        }
    }
}