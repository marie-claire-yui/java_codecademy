public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
    System.out.println(bankOfGods.accountOne.getMonthlyInterest());

  }

}


// 100
// 5000
// 100.0


    // The public and private keywords are used to define what parts of code have access to other classes,
    // methods, constructors, and instance variables.
    // Encapsulation is a technique used to keep implementation details hidden from other classes. 
    //Its aim is to create small bundles of logic.
    // The this keyword can be used to designate the difference between instance variables and local variables.
    // Local variables can only be used within the scope that they were defined in.
    // The this keyword can be used to call methods when writing classes.
