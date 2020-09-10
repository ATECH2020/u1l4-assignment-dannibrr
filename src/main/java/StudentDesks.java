import java.util.Scanner;
 
class StudentDesks {
   public static void main(String[] args) {
 
       //Creates a new scanner for user input
       Scanner scanner = new Scanner(System.in);
 
       //Reads ints from user
       int firstClass = scanner.nextInt();
       int secondClass = scanner.nextInt();
       int thirdClass = scanner.nextInt();
 
       /*
        *  your code goes here
        */
       int firstDesk = (firstClass / 2) + firstClass % 2;
       int secondDesk = (secondClass / 2) + secondClass % 2;
       int thirdDesk = (thirdClass / 2) + thirdClass % 2;
       int totalDesk = firstDesk + secondDesk+ thirdDesk;
 
       System.out.print(totalDesk);
       // closing the scanner object
       scanner.close();
   }
}
