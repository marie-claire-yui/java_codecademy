public class Store {
  // instance fields
  // We can declare as many fields as are necessary for the requirements of our program.
  String productType;
  int inventoryCount;
  double inventoryPrice;

  
  // constructor method
  // The constructor now has multiple parameters to receive values for the new fields
  // We still specify the type as well as the name for each parameter. 
  // We must pass values into the constructor invocation in the same order that they’re listed in the parameters.
  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
  
  // main method
  public static void main(String[] args) {
    Store cookieShop = new Store("cookies",12,3.75);
    System.out.println(cookieShop.inventoryCount);
  }
}