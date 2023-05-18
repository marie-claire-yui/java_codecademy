public class Store {
  // instance fields
  String productType;
  
  // constructor method
  // In order to assign a value to an instance variable, we need to alter our constructor method to include parameters so that it can access the data we want to assign to an instance.
  // We’ve already seen a parameter in the main() method: String[] args, but this is the first time we’re using the parameter value within a method body. 
  public Store(String product) { // Add the String parameter product to the Store() constructor.
    productType = product; // Inside of the constructor method, set the instance variable productType equal to the product parameter.
  }
  
  // main method
  public static void main(String[] args) {
    
    
  }
}

// public class Car {
//   String color;
//   // constructor method with a parameter
//   public Car(String carColor) {
//     // parameter value assigned to the field
//     color = carColor;
//   }
//   public static void main(String[] args) {
//     // program tasks
//   }
// }

// When a String value gets passed into Car(), it is assigned to the parameter carColor.
// Then, inside the constructor, carColor will be assigned as the value to the instance variable color
// Our method also has a signature which defines the name and parameters of the method. 
// In the above example, the signature is Car(String carColor).

//  A formal parameter specifies the type and name of data that can be passed into a method. ( different from actual parameters)
// String carColor is a formal parameter; carColor will represent whatever String value is passed into the constructor. 



// constructor overloading, 
// a class can have multiple constructors as long as they have different parameter values.
// The signature is useful in that it helps the compiler differentiate between the different methods.

// public class Car {
//   String color;
//   int mpg;
//   boolean isElectric;
 
//   // constructor 1
//   public Car(String carColor, int milesPerGallon) {
//     color = carColor;
//     mpg = milesPerGallon;
//   }
//   // constructor 2
//   public Car(boolean electricCar, int milesPerGallon) {
//     isElectric = electricCar;
//     mpg = milesPerGallon;
//   }
// }
//Car myCar = new Car(true, 40) will be created by the second constructor 
// because the arguments match the type and order of the second constructor’s signature.



// If we do not define a constructor, 
//the Java compiler will generate a default constructor that contains no arguments and assigns the object default values. 
//Default values can be created by assigning values to the instance fields during their declaration:

// public class Car {
//     String color = "red";
//     boolean isElectric = false;
//     int cupHolders = 4;
   
//     public static void main(String[] args) {
//       Car myCar = new Car();
//       System.out.println(myCar.color); // Prints: red
//     }
//   }

