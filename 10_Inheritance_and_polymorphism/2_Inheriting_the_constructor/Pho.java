class Pho extends Noodle {
  
  Pho(){ // Pho constructor, call super() to inherit Noodle Constructor and passing directly values into parameters
    super(30.0,0.64,"flat","rice flour");
  }
  
}


// ______________________________________________________________________________________________________

// class Triangle extends Shape {
 
//   Triangle() {
//     super(3);
//   }
 
//   // additional Triangle class members
 
// }

// equivalent ***************************

// class Triangle extends Shape {
 
//   Triangle() {
//     this.numSides = 3;
//   }
 
//   // additional Triangle class methods
 
// }

//n this situation, Java secretly calls the parent class’ no-argument constructor (super()).