public class Store {
    // declare instance fields here!
    // instance variables (to add the data to an object)
      /*
  declare fields inside the class
  by specifying the type and name
  */
    String productType;
    
    // constructor method
    // When an object is created, the constructor sets the initial state of the object. 
    // The state is made up of associated data that represents the characteristics of an object.
    public Store() {
            /* 
    instance fields available in
    scope of constructor method
    */
      System.out.println("I am inside the constructor method.");
    }
    
    // main method
    public static void main(String[] args) {
          // body of main method
      System.out.println("This code is inside the main method."); //   This code is inside the main method.
      
      Store lemonadeStand = new Store(); // I am inside the constructor method.
      
      System.out.println(lemonadeStand); // Store@372f7a8d
    }
  }




