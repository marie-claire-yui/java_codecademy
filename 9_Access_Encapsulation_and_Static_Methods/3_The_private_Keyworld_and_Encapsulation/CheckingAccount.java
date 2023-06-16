public class CheckingAccount{
  private String name; // private instance variable --> can only access from elsewhere inside the same class
  private int balance; // private instance variable --> can only access from elsewhere inside the same class
//While those are valid points, sometimes restricting our code is actually useful from a design perspective.
// This is one of the core ideas behind encapsulation. 
//By making our instance variables (and some methods) private, we encapsulate our code into  bundles of logic.
//By limiting access by using the private keyword we are able to encapsulate our code into individual units.
  public CheckingAccount(String inputName, int inputBalance){
    name = inputName;
    balance = inputBalance;
  }

  private void addFunds(int fundsToAdd){
    balance += fundsToAdd;
  }

  private void getInfo(){
    System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
  }

  public static void main(String[] args){
    CheckingAccount myAccount = new CheckingAccount("Bnp",15000);
    System.out.println(myAccount.balance); //15000 
    myAccount.addFunds(5);
    System.out.println(myAccount.balance); //15005
    myAccount.getInfo(); //This checking account belongs to Bnp. It has 15005 dollars in it 
  } // the instance variable are accessible here because we run CheckingAccount.java 
  // and it's within the class CheckingAccount

}