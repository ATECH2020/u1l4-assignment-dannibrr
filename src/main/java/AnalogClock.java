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
       int currentHour = degree/30;
       int currentHourDegree = currentHour * 30;
       int minutes = degree - currentHourDegree;
       int minsDegree = (30 - minutes) * 6;
       System.out.println("The minutes in degrees that have passed is " + minsDegree + " degrees");
       // closing the scanner object
       scanner.close();
   }
}
