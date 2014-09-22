//Joey Carney
//9/22/14
//hw04--CourseNumber
//This program will read a 6 digit number, and print out which year the course was offered, and during
//which semester that course was offered

import java.util.Scanner;
public class CourseNumber { //public class statement
    public static void main(String[] args) { //main method
        Scanner myScanner = new Scanner(System.in); // scanner object
        System.out.print("Enter a six digit number giving the course semester: "); //prompts user for a 6 digit number
        int course = myScanner.nextInt(); //scanner reads the 6 digit number
        if(course >= 186510 && course <= 201440) { // if the number is between these two numbers, it is legal
            if(((course-10) % 100) == 0 || ((course-20) % 100) == 0 || ((course-30) % 100) == 0 || ((course-40) % 100) == 0) {
                if((course-10) % 100 == 0){
                    String semester = "Spring";
                    System.out.println("The course was offered in the " + semester + " semester of " + (course-10)/100);
                } else if((course-20) % 100 == 0) {
                    String semester = "Summer 1";
                    System.out.println("The course was offered in the " + semester + " semester of " + (course-20)/100);
                } else if((course-30) % 100 == 0) {
                    String semester = "Summer 2";
                    System.out.println("The course was offered in the " + semester + " semester of " + (course-30)/100);
                } else {
                    String semester = "Fall";
                    System.out.println("The course was offered in the " + semester + " semester of " + (course-40)/100);
                }
            } else {
                System.out.println((course - ((course/100) * 100)) + " is not a legititmate semester"); //not a legit submission
            }
        } else {
            System.out.println("The number was outside the range [186510, 201440]"); //user entry is not in range
        }
        
    }
}