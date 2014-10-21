import java.util.Scanner;
public class MoreLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        System.out.println("Please enter an int");
        
        do {
            if(scan.hasNextInt()) {
            
            break;
            }
            scan.next();
            System.out.println("You did not enter a valid int");
            System.out.println("Please enter a valid int");
        } while(!scan.hasNextInt());
        n = scan.nextInt();
        int j=0;
        int k= 0;
        
        while(j<n && j<40) {
        while(k<(j+1)) {
            System.out.println("*");
            k++;
        }
        System.out.println();
        j++;
        
        
        }
        
        
        k = 4;
        while(k<=4) {
            System.out.println("k = " + k);
            k++;
        }
        
        int count = 0;
       int m;
       for(m = 1; m <=5; m++) {
           if(n == m) {
               System.out.println("Case " + n);
               break;
           } 
           
       }
       if(!(n==m)) {
       System.out.println(n + " is greater than 5 or less than 1");
       }
    }
    
}
