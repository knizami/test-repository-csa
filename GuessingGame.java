import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) 
    {
      Scanner scan = new Scanner(System.in);    
     // Choose a random number from 0-100 
     int randomNumber = (int)(Math.random() * 100);
     System.out.println("Random number is: " + randomNumber);
   
  
     // Ask the user to guess a number from 0 to 100 
     // Get the first guess using scan.nextInt();
   
  
     // Loop while the guess does not equal the random number,
  
       // If the guess is less than the random number, print out "Too low!"
     
       // If the guess is greater than the random number, print out "Too high!"
     
       // Get a new guess (save it into the same variable)
     
  
    // Print out something like "You got it!"
  
  
    }    
}
