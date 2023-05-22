public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise(){ // method signature = method name + its parameter type
    // the first line is the  method declaration 
    // public means that other classes can access this method
    // void means that there is no specific output from the method (but for now all our method will be void)
    // advertise() is the name of the method
    // this is a non -static method because there is no static written

    System.out.println("Come spend some money!");
    System.out.println("Selling " + productType + "!");




      }
  // main method
  public static void main(String[] args) {
    
  }
}

// However, we’re not going to see these Strings printed out yet! 