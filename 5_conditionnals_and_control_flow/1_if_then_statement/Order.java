public class Order {
  
  public static void main(String[] args) {
    // example 1:
    //If a conditional is brief we can omit the curly braces entirely:
    // Note: Conditional statements do not end in a semicolon. 
    
    double itemCost = 30.99;
    
    // Write an if-then statement:
    if(itemCost>24.00) System.out.println("High value item!");



// The if keyword marks the beginning of the conditional statement, followed by parentheses ()
    // The parentheses hold a boolean datatype.
    // (For the condition in parentheses we can also use variables that reference a boolean, or comparisons that evaluate to a boolean. )
    // The boolean condition is followed by opening and closing curly braces that mark a block of code.
    boolean isValidPassword = true;
 
    if (isValidPassword) { //This block runs if, and only if, the boolean is true.
 
    System.out.println("Password accepted!");  // Prints "Password accepted!"
 
    }
 

   
    int numberOfItemsInCart = 9;
 
    if (numberOfItemsInCart > 12) {
 
    System.out.println("Express checkout not available"); // Nothing is printed.
 
    }
    
    
  }
  
}