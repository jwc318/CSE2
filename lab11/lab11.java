//Joey Carney
//lab11
//11/5/14

import java.util.Scanner;
public class lab11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Please enter the ten elements of the array");
        System.out.print("Enter the first digit: ");
        array[0] = scan.nextInt();
        for(int i = 1; i < 10; i++) {
            System.out.print("Enter the next digit: ");
            array[i] = scan.nextInt();
        }
        int max = array[0];
        for(int j = 0; j < array.length; j++) {
            if(array[j] > max) {
                max = array[j];
            } 
        }
        System.out.print("The largest value in the array is : " + max);
        System.out.println();
        int min = array[0];
        for(int k = 0; k < array.length; k++) {
            if(array[k] < min) {
                min = array[k];
            }
        }
        System.out.print("The smallest value in the array is : " + min);
        System.out.println();
        int sum = 0;
        for(int m = 0; m < array.length; m++) {
            sum += array[m];
        }
        System.out.print("The sum is : " + sum);
        System.out.println();
        
        int[] switched = new int[10];
        for(int n = 0; n < array.length; n++) {
            switched[n] = array[(array.length - 1) - n];
        }
        
        for(int p = 0; p < array.length; p++) {
            System.out.println(array[p] + "\t" + switched[p]);
        }
    }
}