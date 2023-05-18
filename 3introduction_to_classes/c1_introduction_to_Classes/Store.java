
// All programs require one or more classes that act as a model for the world.
// This is object-oriented programming because programs are built around objects and their interactions
// Classes are a blueprint for objects. Blueprints detail the general structure.

public class Store {
    // instance fields
    // Every instance has access to its own set of variables which are known as instance fields, 
    // which are variables declared within the scope of the instance.
    String productType;
    int inventoryCount;
    double inventoryPrice;
    
    // constructor method 
    // Values for instance fields are assigned within the constructor method.
    // Java classes contain a constructor method which is used to create instances of the class. 
    public Store(String product, int count, double price) {
      productType = product;
      inventoryCount = count;
      inventoryPrice = price;
    }
    
    // main method
    public static void main(String[] args) {
    // In Java, we use the new keyword followed by a call to the class constructor in order to create a new instance of a class
      Store lemonadeStand = new Store("lemonade", 42, .99);
      Store cookieShop = new Store("cookies", 12, 3.75);
      
      //we use . to access the variables and methods of an object or a Class.
      System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
      
      System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
    }
  }