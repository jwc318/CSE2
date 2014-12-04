//Joey Carney
//11/19/14
//lab13--RaggedArrays
import java.util.Scanner;
import java.util.Arrays;
public class RaggedArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp = 0;
        int[][] array = new int[5][17];
        int[][] ordered = new int[5][17];
        System.out.println("The array before sorting");
        for(int i  = 0; i < 5; i++) {
            for(int j = 0; j < i*3 + 5; j++) {
                array[i][j] = (int)(Math.random() * 39);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The array after sorting");
        for(int a = 0; a < 5; a++) {
            //int minIndex = 0;
            for(int b = 0; b < a*3 + 5; b++) {
                for(int c = b; c < a * 3 + 5; c++) {
                   while(array[a][b] > array[a][c]) {
                       temp = array[a][b];
                       array[a][b] = array[a][c];
                       array[a][c] = temp;
                   } 
                }
               // ordered[minIndex] = array[b];
                
                System.out.print(array[a][b] + " ");
            }
            System.out.println();
        }
        //Arrays.sort(array);
        
        
        
        
    }
}