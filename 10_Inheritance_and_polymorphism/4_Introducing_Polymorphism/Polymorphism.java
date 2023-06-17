// Introducing polymorphism

// Polymorphism, which derives from Greek meaning “many forms”, allows a child class to share the information 
//and behavior of its parent class while also incorporating its own functionality.

//Note that the reverse situation is not true; 
//you cannot use a generic parent class instance where a child class instance is required. 

//So an Orange can be used as a Fruit, 
//but a Fruit cannot be used as an Orange.


//------------------------------------------------------
// String makeJuice(Fruit fruit) {
 
//   return "Apple juice and " + fruit.squeeze();
 
// }
 
// // inside main()
// Orange orange = new Orange();
// System.out.println(juicer.makeJuice(orange));

//------------------------------------------------------