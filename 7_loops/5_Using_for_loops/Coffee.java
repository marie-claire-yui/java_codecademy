class Coffee {
  
  public static void main(String[] args) {
    
   // create the correct for loop header, 
   //OR the iteration to loop one too many or one too few times; 
   //this occurrence is known as an “off by one” error.  These are called logical errors. 
   //Leads to miscalculation in our code.
    
    for(int cupsOfCoffee =1 ; cupsOfCoffee<=100 ; cupsOfCoffee++ ) {
      
      System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
     
      
    }
    
  }
  
}