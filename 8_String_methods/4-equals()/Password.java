//equals()

//With objects, such as Strings,
// we can’t use the primitive equality operator == to check for equality between two strings.
// To test equality with strings, we use a built-in method called equals().

//Side note, there’s also an equalsIgnoreCase() 
//method that compares two strings without considering upper/lower cases.

//We can also compare String values lexicographically (think dictionary order) using the .compareTo() method
    // If the method returns 0, the two Strings are equal.
    // If the value is less than 0, then the String object is lexicographically less than the String object argument.
    // If the value is greater than 0, then the String object is lexicographically greater than the String object argument.
//Using .compareToIgnoreCase() will perform the same task, but will not consider upper/lower case.

public class Password {
  
  public static void main(String[] args) {
    
    String password = "correcthorsebatterystaple";
    
    // Write the code:
    System.out.println(password.equals("correcthorsebatterystaple")); //true
  }
  
}