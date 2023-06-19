// Method Overriding
//overriding parent class methods in a child class
//  useful when we want our child class method to have the same name as a parent class method 
//  but behave a bit differently in some way


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
  
  public void cook() {
    
    System.out.println("Boiling.");
    
    this.texture = "cooked";
//      Grinding or scraping dough.
//      Boiling
  }
  
  public static void main(String[] args) {
    
    Spaetzle kaesespaetzle = new Spaetzle();
    kaesespaetzle.cook();
    
  }
  
}

// --------------------------------------------------------------------------------------------------
// class BankAccount {
//   protected double balance;
 
//   public BankAccount(double balanceIn){
//     balance = balanceIn;
//   }
 
//   public void printBalance() {
//     System.out.println("Your account balance is $" + balance);
//   }
// }


//--------------------------------------------------------------------------------------------------------
// class CheckingAccount extends BankAccount {
//   public CheckingAccount(double balance) {
//     super(balance);
//   }
 
//   @Override
//   public void printBalance() {
//     System.out.println("Your checking account balance is $" + balance);
//   }
 
//   public void checkBalances() {
//     // calls method from CheckingAccount
//     printBalance(); // Overrididen method (slightly modified compared to the parent's one)
//     // calls method from BankAccount
//     super.printBalance(); //super; we can also use this keyword to call the methods of a parent class
//   } //While we now have the ability to override methods from a superclass, 
//we may find ourselves in a unique situation where we want to use the superclass method instead of the subclass’ overridden method. 
 
//   public static void main(String[] args) {
//     CheckingAccount myCheckings = new CheckingAccount(5000);
//     myCheckings.checkBalances();
//   }
// }
// output
// Your checking account balance is $5000
// Your account balance is $5000