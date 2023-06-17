public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    this.accountOne = new CheckingAccount("Zeus", 100, "1");
    this.accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    bankOfGods.accountOne.getAccountInformation();
    // We could get all the account information, even if calculateNextMonthInterest() is private.
// Money in account: 100
// Next Month's Interest: 2.0
  //  bankOfGods.accountOne.calculateNextMonthInterest();
//Bank.java:13: error: calculateNextMonthInterest() has private access in CheckingAccount
  }

}