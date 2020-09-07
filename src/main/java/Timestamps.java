import java.util.Scanner;
 
class Timestamps {
   public static void main(String[] args) {
 
       //Creates a new scanner for user input
       Scanner scanner = new Scanner(System.in);
 
       //Reads ints from user
       int hours1 = scanner.nextInt();
       int minutes1 = scanner.nextInt();
       int seconds1 = scanner.nextInt();
       int hours2 = scanner.nextInt();
       int minutes2 = scanner.nextInt();
       int seconds2 = scanner.nextInt();
       System.out.println(hours1 + ":" + minutes1 + "." + seconds1 + " 1st time stamp");
       System.out.println(hours2 + ":" + minutes2 + "." + seconds2 + " 2nd time stamp");
    
 
       /*
        *  your code goes here
        */
       int hoursPassed = hours2 - hours1;
       int minsPassed = minutes2 - minutes1;
       int secPassed = seconds2 - seconds1;
       int hoursConvert = hoursPassed * 3600;
       int minsConvert = minsPassed * 60;
       int secConvert = secPassed * 1;
       int timePassed = hoursConvert + minsConvert + secConvert;
 
       System.out.println(timePassed + " seconds have passed");
      
 
       // closing the scanner object
       scanner.close();
   }
}
