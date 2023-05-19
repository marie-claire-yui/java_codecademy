public class Store {
  
  // new method: constructor! in order to create an object (an instance of a class)
  public Store() { // the constructor shares the same name as the class: here Store, the constructor is defined within the class
     System.out.println("I am inside the constructor method."); // appear each time the constructor is called/ invoked
  }
  
  // main method is where we create instances!
  public static void main(String[] args) {
    System.out.println("Start of the main method.");
    
    
    // create the instance below
    Store lemonadeStand = new Store(); // To create an instance, after the assignment operator we need to call or invoke the constructor within main()
    // The following example assigns a Store instance to the variable lemonadeStand
    // During its declaration, the class name is used as the variable’s type. In this case, the type is Store
    System.out.println(lemonadeStand); //Store@372f7a8d in this example, instead of being declared with a primitive data type like int or boolean,
    // our variable lemonadeStand is declared as a reference data type. 
    //This means that the value of our variable is a reference to an instance’s memory address.
    // print the instance below
    lemonadeStand = null ; // change value to null
    System.out.println(lemonadeStand); //prints null
  }
}

// We can initialize a reference-type variable without assigning it a reference if we utilize the special value null. 
// Something that is null has no value; if we were to assign null to an object, it would have a void reference.
// For example, in the code above, we’ll create an instance of Store, assign it a reference, and then change its value to null
// It’s important to note that if we use a null reference to call a method or access an instance variable, we will receive a NullPointerException error.
// We don’t care about memory location, but our instances have no other characteristics!
