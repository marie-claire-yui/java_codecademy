// incrementing while loops
//When looping through code, it’s common to use a counter variable.
// A counter (also known as an iterator) is a variable used in the conditional logic of the loop and 
//(usually) incremented in value during each iteration through the code


class Coffee {
  
  public static void main(String[] args) {
    
    // initialize cupsOfCoffee with a value of 1.
    int cupsOfCoffee = 1;
    // add while loop with counter
    // a while loop that runs as long as cupsOfCoffee is less than or equal to 100
    while (cupsOfCoffee <=100){
      cupsOfCoffee++;
      System.out.println("Fry drinks cup of coffee #"+ cupsOfCoffee);
    }
        
    
  }
  
}