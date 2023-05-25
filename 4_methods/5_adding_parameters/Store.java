public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
    String message = "Selling " + productType + "!";
		System.out.println(message);
  }
  
  //Similar to how we added parameters to constructors, we can customize all other methods to accept parameters.
  //  the method signature includes the method name as well as the parameter types of the method
  public void greetCustomer(String customer){
    System.out.println("Welcome to the store, " + customer +"!");
  }
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade");
// in the main() method, we call greetCustomer() method on the lemandeStand object and provide an argument String "Yui"
    lemonadeStand.greetCustomer("Yui"); // output : "Welcome to the store, Yui!"
    
  }
}

// Note that when we call on a method with multiple parameters, the arguments given in the call must be placed in the same order as the parameters appear in the signature.
// If the argument types do not match the parameter types, we’ll receive an error.

// Through method overloading, our Java programs can contain multiple methods with the same name as long as each method’s parameter list is unique