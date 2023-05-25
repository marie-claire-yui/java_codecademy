public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
  public void checkBalance(){
    System.out.println("Hello!");
    System.out.println("Your balance is " + balance);
  }

  public void deposit(int amountToDeposit){
    balance = balance + amountToDeposit;
    System.out.println("You  just deposited "+ amountToDeposit);
  }

  public int withdraw(int amountToWithdraw){
    balance = balance - amountToWithdraw;
   return amountToWithdraw;
  }
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //Check balance:
    savings.checkBalance();
    
    //Withdrawing:
    savings.withdraw(300);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Deposit:
    int afterDeposit2 = savings.balance + 600;
    savings.balance = afterDeposit2;
    System.out.println("You just deposited "+600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
  }


public int toString(int balance){
    return balance;
  }   

}

//  Methods are a powerful way to abstract tasks away and make them repeatable. 
// They allow us to define behavior for classes, so that the Objects we create can do the things we expect them to

// Defining a method : Method declarations will declare a method’s return type, name, and parameters
// Calling a method : Methods are invoked with a . and ()
// Parameters : Inputs to the method and their types are declared in parentheses in the method signature
// Changing Instance Fields : Methods can be used to change the value of an instance field
// Scope : Variables only exist within the domain that they are created in
// Return : The type of the variables that will be output are declared in the method declaration
