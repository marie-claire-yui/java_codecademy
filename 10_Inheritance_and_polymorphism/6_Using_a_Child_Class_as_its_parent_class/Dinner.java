// Using a Child Class as its Parent Class

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



//An important facet of polymorphism is the ability to use a child class object 
//where an object of its parent class is expected.
//example:
//BankAccount kaylasAccount = new CheckingAccount(600.00); //instantiate a child class object as a member of the parent class.

// We can use kaylasAccount as if it were an instance of BankAccount, 
//in any situation where a BankAccount object would be expected.
// This would be true even if kaylasAccount were instantiated as a CheckingAccount

//It is important to note here that the compiler just considers kaylasAccount to be any old BankAccount. 
//But because method overriding is handled at runtime, if we call printBalance(), 
//we’ll see something CheckingAccount specific:
//example
// Your checking account balance is $600.00

// if CheckingAccount has a method transferToSavings() that BankAccount does not have
// The compiler believes that kaylasAccount is just a BankAccount that doesn’t have 
//some fancy child class transferToSavings() method, so it would throw an error.

class Dinner {
  
  private void makeNoodles(Noodle noodle, String sauce) { //makeNoodles() method that accepts a Noodle object as an argument.
    
    noodle.cook();
    
    System.out.println("Mixing " + noodle.texture + " noodles made from " + noodle.ingredients + " with " + sauce + ".");
    System.out.println("Dinner is served!");
    
  }
  
  public static void main(String[] args) {
    
    Dinner noodlesDinner = new Dinner();
    // Add your code here:
    Noodle biangBiang = new BiangBiang(); //instantiate a BiangBiang object as a Noodle called biangBiang. 

    noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");
    
    
  }
  
}

// Mixing cooked noodles made from high-gluten flour, salt, water with soy sauce and chili oil.
// Dinner is served!