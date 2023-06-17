// Modifying static variables

//Whether you’re writing code in a constructor, a non-static method, or a static method, 
//you have access to static variables.

public class ATM{
  // Static variables
  public static int totalMoney = 0;
  public static int numATMs = 0;

  // Instance variables
  public int money;

  public ATM(int inputMoney){
    this.money = inputMoney;

    // Steps 1 and 2: Edit numATMs and total money here
    // For example, our variable numATMs is keeping track of the total number of ATMs in the system.
    // Therefore, every time an ATM is created (using the constructor), we should increase that variable by 1. 
        numATMs = numATMs + 1;
    System.out.println(numATMs);

    totalMoney = totalMoney + inputMoney;
  }

//Whenever we remove money from an ATM using the non-static withdrawMoney() method,
// we should modify the money instance variable for that particular ATM as well as the totalMoney variable. 
  public void withdrawMoney(int amountToWithdraw){
    if(amountToWithdraw <= this.money){
      this.money -= amountToWithdraw;
      // Step 3: Edit totalMoney here
      totalMoney -= amountToWithdraw;
    }
  }

  public static void main(String[] args){

    System.out.println("Total number of ATMs: " + ATM.numATMs); 
    ATM firstATM = new ATM(1000);
    ATM secondATM = new ATM(500);
    System.out.println("Total number of ATMs: " + ATM.numATMs); 

    System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);  
    firstATM.withdrawMoney(500);
    secondATM.withdrawMoney(200);
    System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);    

// Total number of ATMs: 0
// 1
// 2
// Total number of ATMs: 2
// Total amount of money in all ATMs: 1500
// Total amount of money in all ATMs: 800

   }

}

