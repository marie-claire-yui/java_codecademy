// Getting an item's index

// indexOf() method

import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("listen to Dr. Watson for amusement");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    sherlocksToDos.remove("visit the crime scene");
    
    // Calculate to-dos until case is solved:
    // use indexOf() to determine where in the to-do list "solve the case" is. 
    System.out.println(sherlocksToDos.indexOf("solve the case"));
      
    // Change the value printed:
    System.out.println("PRINT THE ANSWER HERE");

  }
  
}

//3
// PRINT THE ANSWER HERE