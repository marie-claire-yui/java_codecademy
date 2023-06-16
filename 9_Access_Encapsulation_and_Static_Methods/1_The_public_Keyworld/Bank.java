public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    System.out.println(bankOfGods.accountOne.name); // We want to access the name, one of the instance fields of class CheckingAccount, this name should therefore be public
    bankOfGods.accountOne.addFunds(5); // as we are calling the method from class CheckingAccount in the psvm of bank class we should declare this method public 
    bankOfGods.accountOne.getInfo(); // same here

  }

}

// We should only run the class that contains the psvm