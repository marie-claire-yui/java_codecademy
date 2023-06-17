public class CheckingAccount{
  private String name;
  private int balance;
  private String id;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    name = inputName;
    balance = inputBalance;
    id = inputId;
  }

  //Write new methods here:
  public int getBalance(){
    return balance;
  }
//Even though the instance variable name is private, other classes could call 
//the public method getName() which returns the value of that instance variable.
// Accessor methods always public, and a return type that matches the type of the instance var they’re accessing.
  public void setBalance(int newBalance){
    balance = newBalance;
  }
}
//Similarly, private instance variables often have mutator methods (sometimes known as “setters”). 
//These methods allow other classes to reset the value stored in private instance variables.
//Mutator methods, or “setters”, often are void methods — they don’t return anything, 
//they just reset the value of an existing variable. Similarly, they often have one parameter that is the same type as the variable they’re trying to change.