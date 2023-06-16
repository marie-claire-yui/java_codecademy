// Importing the Random library
import java.util.Random;

class LuckyFive {
  
  public static void main(String[] args) {
    
    // Creating a random number generator
    Random randomGenerator = new Random();
    
    // Generate a number between 1 and 6
    int dieRoll = randomGenerator.nextInt(6) + 1;
// the code inside a while loop will only run if the condition is true. 
// However, a while loop will continue running the code over and over until the condition evaluates to false.
// However, if you aren’t certain that change will occur, beware the infinite loop! 
    // Repeat while roll isn't 5
    while(dieRoll != 5){
      dieRoll =  randomGenerator.nextInt(6) + 1;
      System.out.println(dieRoll);
    }
    
    
  }
  
}