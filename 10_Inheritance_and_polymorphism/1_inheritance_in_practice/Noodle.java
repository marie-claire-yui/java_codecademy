// Noodle is the parent class

class Noodle {
  
  double lengthInCentimeters;
  String shape;
  String texture = "brittle";
  
  public void cook() {
    
    this.texture = "cooked";
    
  }
  //We always need to run our program using the file that contains the main() method.
  public static void main(String[] args) {
    Spaghetti spaghettiPomodoro = new Spaghetti(); //instantiate a new Spaghetti object called spaghettiPomodoro
    System.out.println(spaghettiPomodoro.texture); //Print out its texture field to the terminal. --> brittle
  }
  
}

// We can instantiate the class Spaghetti and build a spaghettiPomodoro object 
// We can print out the texture of spaghettiPomodoro which has been defined in the parent class Noodle
// This is possible because Spaghetti inherit traits such as instance fields from the parent class Noodle 
