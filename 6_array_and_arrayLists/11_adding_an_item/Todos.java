import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    //We’ve created an empty ArrayList called toDoList
    ArrayList<String> toDoList = new ArrayList<String>();
    // Below where we’ve initialized toDo1, toDo2, and toDo3. we have set their values to any tasks we like.
    String toDo1 = "Water plants";
    String toDo2 = "Do the washing up";
    String toDo3 = "Cook";
    
    // Add to-dos to toDoList
    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);
    
    // Print the toDoList (arrayList of type String)
    System.out.println(toDoList);
      
    
  }
  
}