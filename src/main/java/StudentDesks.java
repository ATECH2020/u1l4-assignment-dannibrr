import java.util.Scanner;
 
class SecondsPastMidnight {
   public static void main(String[] args) {
 
       //Creates a new scanner for user input
       Scanner scanner = new Scanner(System.in);
 
       //Reads int from user
       int numSec = scanner.nextInt();
 
       //Your code goes here
       System.out.println(numSec + " seconds have passed since midnight");
       int minInHour = 60;
       int secInHour = minInHour * 60;
       int numMinutes = numSec/60;
       int numHours = numSec/secInHour;
       System.out.println(numHours + " hours have passed since midnight");
       System.out.println(numMinutes + " minutes have passed since midnight");        
 
       // closing the scanner object
       scanner.close();
   }// ends the main method
} //ends the class
