// concat()

// The concat() method concatenates one string to the end of another string. 
// Concatenation is the operation of joining two strings together.

public class CombineNames {
  
	public static void main(String[] args) {

    // Add your first names:
    String firstName = "yui";  
    String lastName = "kasai";

    // What's the full name?
    System.out.println(firstName.concat(lastName));
    
  }
  
}

//Strings are immutable objects which means that String methods, like concat() do not actually change a String object. 
// String name = new String("Code");
// name = name.concat("cademy");
// System.out.println(name);
//Our variable, name holds a reference to the String object, "Code".
// When we use concat() on name, we changed its value so that it references a new object
// — "Code", combined with the String literal, "cademy". 

//Suppose we do something slightly different. We’ll use concat() on name without reassigning its value:
// String name = "Code";
// name.concat("cademy");
// System.out.println(name);
//Code would be printed instead. The value of the String can’t change! 
//Instead, we create a new object and need to assign that new object to some variable

//When we use concat() on another String, we don’t concatenate its memory address to the original String. 
//Instead, we combine the result of its toString() method to the original String. 