public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
// Remember, variables can only exist in the scope that they were declared in. 
// We can use a value outside of the method it was created in if we return it from the method. 
// The return value’s type must match the return type of the method. 
//If the return expression is compatible with the return type, a copy of that value gets returned in a process known as return by value.
  // We return a value by using the keyword return:
public double getPriceWithTax(){ // we replace void by double to signify that the return type is a double
  double totalPrice = price + price * 0.08;
  return totalPrice;
  // Once the return statement is executed, the compiler exits the function.
  // Any code that exists after the return statement in a function is ignored.
  
}
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    // Unlike void methods, non-void methods can be used as either a variable value or as part of an expression like so
    double lemonadePrice = lemonadeStand.getPriceWithTax();
    // Within main method(), we called getPriceWithTax() method on lemonadePrice
   System.out.println(lemonadePrice);

  }
}

// rq: We learned how to return primitive values from a method
// Returning an object works a little differently than returning a primitive value. When we return a primitive value, a copy of the value is returned; 
//however, when we return an object, we return a reference to the object instead of a copy of it.