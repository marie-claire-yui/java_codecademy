//                     Modifier           CLass           Package          Child Class       Global
//                     public                yes             yes              yes              yes
//                     protected            yes               yes               yes             no
//                      no modifier         yes              yes               no              no
//                      private             yes              no                 no             no

//  If we add final after a parent class method’s access modifier,
//  we disallow any child classes from changing that method. 


public class Noodle {
  
  private double lengthInCentimeters;
  private double widthInCentimeters;
  private String shape;
  protected String ingredients; // so That the child class can inherit this instance field
  private String texture = "brittle";
  
  Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
    
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
    
  }
  //(Remove the method from Ramen)
  // add a final keyword to isTasty() in Noodle so that no one can override this method. Even in the child class
  public final boolean isTasty() {
    
    return true;
    
  }
  
  public static void main(String[] args) {
    
    Ramen yasaiRamen = new Ramen();
    //System.out.println(yasaiRamen.ingredients);
    System.out.println(yasaiRamen.isTasty());
    
  }
  
}
