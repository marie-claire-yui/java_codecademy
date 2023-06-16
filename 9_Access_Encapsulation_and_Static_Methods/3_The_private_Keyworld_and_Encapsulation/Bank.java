public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100);
    accountTwo = new CheckingAccount("Hades", 200);
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    //we get errors when a Bank tries to access private data from a CheckingAccount
    System.out.println(bankOfGods.accountOne.name);//Bank.java:12: error: name has private access in CheckingAccount
    bankOfGods.accountOne.addFunds(5); //Bank.java:13: error: addFunds(int) has private access in CheckingAccount
    bankOfGods.accountOne.getInfo(); //Bank.java:14: error: getInfo() has private access in CheckingAccount

  }

}// 3 Errors when we try to run Bank.java