// What are access and scope

//the concepts of access and scope both center around what parts of your programs can interact with specific
// variables or methods from other parts of your program.


public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100);
    accountTwo = new CheckingAccount("Hades", 200);
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    System.out.println(bankOfGods.accountOne.name); // Bank.java:12: error: name has private access in CheckingAccount
    System.out.println(bankOfGods.accountOne.balance);//Bank.java:13: error: balance has private access in CheckingAccount
  }

}

// should run the file where the main method is