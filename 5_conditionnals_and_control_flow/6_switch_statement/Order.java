public class Order {
  boolean isFilled;
  double billAmount;
  String shipping;
  
  public Order(boolean filled, double cost, String shippingMethod) {
		if (cost > 24.00) {
        System.out.println("High value item!");
        }  
            isFilled = filled;
            billAmount = cost;
            shipping = shippingMethod;
        }
  
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }
  
  public double calculateShipping() {
    double shippingCost; //There’s an uninitialized variable shippingCost in calculateShipping()
	// declare switch statement here
    switch(shipping){ 
        case "Regular":
        shippingCost=0; //  Assign the correct value to shippingCost
            break;
        case "Express":
        shippingCost=1.75; //  Assign the correct value to shippingCost 
            break;
        default:
        shippingCost=.50; //  Assign the correct value to shippingCost 
            break;
        }
    
    return shippingCost;
 	}
  
  public static void main(String[] args) {
    // do not alter the main method!
    Order book = new Order(true, 9.99, "Express");
    Order chemistrySet = new Order(false, 72.50, "Regular");
    
    book.ship();
    chemistrySet.ship();
  }
}