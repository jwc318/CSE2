//Joey Carney
//11/17/14
//hw10--FindDuplicates
//This program will determine whether a user-entered array has duplicates, and whether the 
//array only has one pair of duplicates or not


import java.util.Scanner; //import statement for scanner
public class FindDuplicates{ //public class declaration
  public static void main(String [] arg){ //main method
    Scanner scan=new Scanner(System.in); //creates the scanner
    int num[]=new int[10]; //creates the new array
    String answer="";
    do{
      System.out.print("Enter 10 ints- "); //prompts user for input
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt(); //user enters the input into the array
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){ //call to the hasDups method
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){ //call to the exactlyOneDup method
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate."; 
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y")); //if user enters y or Y, repeat
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static boolean hasDups(int[] num) {
      for(int i = 0; i < num.length; i++) { 
          for(int j = i + 1; j < num.length; j++) {
              if(num[i] == num[j]) { //if values are equal, return true
                  return true;
              }
          }
      }
      return false; //otherwise, return false
  }
  
  public static boolean exactlyOneDup(int[] num) {
      int count = 0;
      for(int i = 0; i < num.length; i++) {
          for(int j = i + 1; j < num.length; j++) {
              if(num[i] == num[j]) { //if values are equal, increment count
                  count++;
              }
          }
      }
      if(count == 0) {
          return false;
      } else if(count == 1) { //if count is equal to 1, return true
          return true;
      } else {
          return false;
      }
  }
  
}
