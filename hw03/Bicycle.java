//Joey Carney
//HW03-Bicycle
//9/15/14
//This program will read number of counts and seconds, and compute distance, time, and average mph

import java.util.Scanner; // imports Scanner class
public class Bicycle { //Define Main class
    public static void main(String[] args) { //Define main method
        Scanner in = new Scanner(System.in); //Define Scanner class, set value to "in"
        //Variable declaration
        int num_counts;
        int num_seconds;
        System.out.print("Enter the number of counts: \n"); // prompts number of counts
        num_counts = in.nextInt();//scans number of counts
        System.out.print("Enter the number of seconds: \n");// prompts number of seconds
        num_seconds = in.nextInt();//scans number of seconds
        double wheel_diameter = 2.25; // sets wheel diameter to 2.25
        double distance = num_counts * wheel_diameter * Math.PI; // computes distance
        double duration = num_seconds / 60; // computes duration of trip
        System.out.printf("The distance was %.2f miles and took %.2f minutes. \n", distance, duration); // prints distance and duration
        double avg_mph = distance / (duration / 60);//calculates average mph
        System.out.printf("The average mph was %.2f \n", avg_mph); // prints average mph
        
        
        
    }
}