import java.util.Scanner;
 
class SecondsPastMidnight {
   public static void main(String[] args) {
 
       //Creates a new scanner for user input
       Scanner scanner = new Scanner(System.in);
 
       //Reads int from user
       int numSec = scanner.nextInt();
 
       //Your code goes here
       int numMinutes = numSec/60;
       int numHours = numSec/3600;
       System.out.print(numHours + " " + numMinutes);        
 
       // closing the scanner object
       scanner.close();
   }// ends the main method
} //ends the classs
 
