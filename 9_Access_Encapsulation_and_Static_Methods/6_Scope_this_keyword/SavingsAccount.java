public class SavingsAccount{

  public String owner;
  public int balanceDollar;
  public double balanceEuro;

  public SavingsAccount(String owner, int balanceDollar){
    // Complete the constructor
    //If we wanted to access the instance variable and not the local variable, we could use the this keyword.
    //The this keyword is a reference to the current object.
this.owner = owner;
this.balanceDollar = balanceDollar;
 this.balanceEuro = balanceDollar * 0.85;
  }

  public void addMoney(int balanceDollar){
    // Complete this method
    System.out.println("Adding "+ balanceDollar +" dollars to the account.");
   this.balanceDollar += balanceDollar;
   System.out.println("The new balance is " + this.balanceDollar+ " dollars.");
  }

  public static void main(String[] args){
    SavingsAccount zeusSavingsAccount = new SavingsAccount("Zeus", 1000);

    // Make a call to addMoney() to test your method
      zeusSavingsAccount.addMoney(2000);
      
  }

}
//output
// Adding 2000 dollars to the account.
// The new balance is 3000 dollars.