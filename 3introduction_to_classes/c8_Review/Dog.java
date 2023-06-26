// Java is an object-oriented programming language where every program has at least one class.
// Programs are often built from many classes and objects, which are the instances of a class. 
// Classes define the state and behavior of their instances.
// Behavior comes from methods defined in the class. 
// State comes from instance fields declared inside the class.
// Classes are modeled on the real-world things we want to represent in our program
// This program is a single class (we'll explore multiple classes program later)

public class Dog {
  String breed;
  boolean hasOwner;
  int age;
  
  public Dog(String dogBreed, boolean dogOwned, int dogYears) {
    System.out.println("Constructor invoked!");
    breed = dogBreed;
    hasOwner = dogOwned;
    age = dogYears;
  }
  
  public static void main(String[] args) {
    System.out.println("Main method started"); // Main method started
    Dog fido = new Dog("poodle", false, 4); // Constructor invoked!
    Dog nunzio = new Dog("shiba inu", true, 12);// Constructor invoked!
    boolean isFidoOlder = fido.age > nunzio.age; 
    int totalDogYears = nunzio.age + fido.age;
    System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed); // Two dogs created: a poodle and a shiba inu  
    System.out.println("The statement that fido is an older dog is: " + isFidoOlder);// The statement that fido is an older dog is: false
    System.out.println("The total age of the dogs is: " + totalDogYears);// The total age of the dogs is: 16
    System.out.println("Main method finished");// Main method finished
  }
}




     


