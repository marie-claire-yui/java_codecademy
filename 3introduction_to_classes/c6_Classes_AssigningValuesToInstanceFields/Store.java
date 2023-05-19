public class Store {
  // instance fields
  String productType;
  
  // constructor method
  // Now that our constructor has a parameter, we must pass values into the method call. 
  // These values are referred to as arguments; once they are passed in, 
  // they will be used to give the instance fields initial value
  public Store(String product) {
    // assign parameter value to instance field
    productType = product;
  }
  
  // main method
  public static void main(String[] args) {
    // parameter value supplied when calling constructor
    // we create an instance lemonadeStand in the main() method with "lemonade" as its productType field
    Store lemonadeStand = new Store("lemonade");
    // we pass the value "lemonade" to our constructor method call: new Store("lemonade");
    // the type of the value given to the invocation must match the type declared by the parameter
    // Inside the constructor, the parameter product refers to the value passed during the invocation :"lemonade".
    // This value is asigned to the instance field productType
    // product type has already been declared so we don't need to specify the dype during assignment
    // the object lemonadeStand holds the state of product as an instance fiel referencing the value "lemonade"
    System.out.println(lemonadeStand.productType);
    // we access the value of the field with the dot operator .
  }
} 

// An actual parameter, or argument, refers to the value being passed during a method call.
// Call by value is the process of calling a method with an argument value.
// When an argument is passed, the formal parameter is initialized with a copy of the argument value. 

