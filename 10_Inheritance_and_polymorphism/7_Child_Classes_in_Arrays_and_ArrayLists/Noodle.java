// Child Classes in Arrays and ArrayLists

//Usually, when we create an array or an ArrayList, the list items all need to be the same type. 
//But polymorphism puts a new spin on
//In fact, we can put instances of different classes that share a parent class together in an array or ArrayList

class Noodle {
  
  protected double lengthInCentimeters;
  protected double widthInCentimeters;
  protected String shape;
  protected String ingredients;
  protected String texture = "brittle";
  
  Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
    
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
    
  }
  
  public String getCookPrep() {
    
    return "Boil noodle for 7 minutes and add sauce.";
    
  }
  
  
  public static void main(String[] args) {
    
    Noodle spaghetti, ramen, pho;
    
    spaghetti = new Spaghetti();
    ramen = new Ramen();
    pho = new Pho();
    
    // Add your code below:
    Noodle[] allTheNoodles = {spaghetti, ramen, pho};
    // We can even iterate through the list of items — regardless of subclass — and perform the same action with each item:
    for(Noodle noodle: allTheNoodles){ 
      System.out.println(noodle.getCookPrep(  ));
    }
  }
  
}

// Boil spaghetti for 8 - 12 minutes and add sauce, cheese, or oil and garlic.
// Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables.
// Soak pho for 1 hour, then boil for 1 minute in broth. Then garnish with cilantro and jalapeno.