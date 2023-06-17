// Introducing Inheritance

// important feature of POO
//Java class can also inherit traits from another class.

// Example: parent class shape and child class triangle
//Because a Triangle is a Shape, we can define Triangle so that it inherits fields and methods directly from Shape.
// A reference of type Shape can refer to an object of Shape or an object of Triangle.
//Our Triangle class will inherit all the traits of Shape,
// but Triangle can also contain its own unique methods and variables.
//For example, we could have an instance variable called hypotenuse and a method called findHypotenuse() 
//that can only be accessed by Triangle class references.
// Objects of Triangle can call any method contained in Triangle or Shape

// There are several terms you’ll encounter frequently:

//     Parent class, superclass, and base class refer to the class that another class inherits from (like Shape).
//     Child class, subclass, and derived class refer to a class that inherits from another class (like Triangle).


//define a child class so that it inherits from a parent class by using the keyword "extends"
class Shape {
 
    // Shape class members
   
  }
   
  class Triangle extends Shape {
   
    // additional Triangle class members
   
  }



  // Until now, we’ve only been working with one class and one file. 
  //However, most Java programs utilize multiple classes, each of which requires its own file.
  // Only one file needs a main() method — this is the file we will run.

  //Note: the various classes in our Java package — even though they are in different files 
  //— will have access to each other, so we can instantiate one class inside of another.