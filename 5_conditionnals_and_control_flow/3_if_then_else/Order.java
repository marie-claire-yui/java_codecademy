public class Order {
  //We’ve seen how to conditionally execute one block of code, 
  //but what if there are two possible blocks of code we’d like to execute? 
  
  //This code is also called an if-then-else statement:
    //If condition is true, then do something.
    //Else, do a different thing.

  public static void main(String[] args) {
    
    boolean isFilled = false;
    
    // Write an if-then-else statement:
    // This conditional statement ensures that exactly one code block will be run.
    // If the condition, hasPrerequisite, is false, the block after else runs.
    // There are now two separate code blocks in our conditional statement. 
    if (isFilled == true){ // The first block runs if the condition evaluates to true
      System.out.println("Shipping"); 
    } else { //We create an alternate conditional branch with the else keyword:
      System.out.println("Order not ready"); // the second block runs if the condition evaluates to false.
    }
    
  }
  
}