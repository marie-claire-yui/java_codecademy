

public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  

  // A method is a task that an object of a class performs.
  // We mark the domain of this task using curly braces: {, and }.
  // Everything inside the curly braces is part of the task. This domain is called the scope of a method.
  // We can’t access variables that are declared inside a method in code that is outside the scope of that method. 
  // advertise method
  public void advertise() {
    String message = "Selling " + productType + "!";
		System.out.println(message);
  }
  
  // main method
  // The variable message, which is declared and initialized inside of advertise(), cannot be used inside of main()
  //  It only exists within the scope of the advertise() method.
  public static void main(String[] args) {
    String cookie = "Cookies";
    Store cookieShop = new Store(cookie);
    
    cookieShop.advertise();
  }
}
// However, milesDriven, which is declared at the top of the class, can be used inside all methods in the class,
// since it is in the scope of the whole class. 