import java.util.Scanner;
 
class AnalogClock {
   public static void main(String[] args) {
 
       //Creates a new scanner for user input
       Scanner scanner = new Scanner(System.in);
 
       //Reads ints from user
     int degree = scanner.nextInt();
 
       /*
        *  your code goes here
        */
       int minuteDegree = (degree % 30) * 12;
       System.out.print(minuteDegree);
       // closing the scanner object
       scanner.close();
   }
}
