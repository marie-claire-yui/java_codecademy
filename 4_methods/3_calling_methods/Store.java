// When we add a non-static method to a class, it becomes available to use on an object of that class.
// In order to have our methods get executed, we must call the method on the object we created

public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // advertise method
  // non static advertise() method
  public void advertise() {
		System.out.println("Selling " + productType + "!");
    System.out.println("Come spend some money!");
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade");
    // insde the main() method we call advertise() on lemonadeStand object
    // we first reference our object lemonadeStand. Then we use the dot operator . to call the method advertise().
    // Note that we must include parentheses () after our method name in order to call it.
    lemonadeStand.advertise();
    lemonadeStand.advertise();
    lemonadeStand.advertise();
  }
}

// Code generally runs in a top-down order where code execution starts at the top of a program and ends at the bottom of a program;
//  however, methods are ignored by the compiler unless they are being called.
// When a method is called, the compiler executes every statement contained within the method. 
// Once all method instructions are executed, the top-down order of execution continues