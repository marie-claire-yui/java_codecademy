// import the ArrayList package here:
import java.util.ArrayList;

class ToDos {
  
  public static void main(String[] args) {
    
    // Create toDoList below:
    //To create an ArrayList, we need to declare the type of objects iwthin angle brackets < and > it will hold
    // These symbols are used for generics. 
    // Generics are a Java construct that allows us to define classes and objects as parameters of an ArrayList.
    // For this reason, we can’t use primitive types in an ArrayList
    ArrayList<String> toDoList = new ArrayList<String>();
    //We can initialize to an empty ArrayList using the new keyword
    //Create a new ArrayList that will contain String elements and call it toDoList.
  }
  
}