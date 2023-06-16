// Introduction to String Methods

// a String, is an object that represents a sequence of characters.
// Java dedicated a class to them
// the String class has a lot of useful methods to help us perform operations on Strings and data manipulation.
// We don’t have to import anything to use the String class because it’s part of the java.lang package 
// which is available by default.

public class HelloWorld {
  
	public static void main(String[] args) {
    
    String str = "Hello, World!";
    
    // Examples:

    System.out.println(str.length()); //13
    
    System.out.println(str.substring(4)); //o, World!    
    
    System.out.println(str.toUpperCase()); //HELLO, WORLD!
    
  }
  
}
