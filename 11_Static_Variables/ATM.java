// Static Variables

//you can think of static variables as belonging to the class itself 
//instead of belonging to a particular object of the class.
// we can access static variables by using the name of the class and the . operator
// we declare static variables by using the static keyword during declaration.
//This keyword usually comes after the variable’s access modifier (public or private). 
public class ATM{

  // Step 2: Create your static variables here
public static int totalMoney = 0;
public static int numATMs = 0;
  // Instance variables
  public int money;

  public ATM(int inputMoney){
    this.money = inputMoney;
  }

  public void withdrawMoney(int amountToWithdraw){
    if(amountToWithdraw <= this.money){
      this.money -= amountToWithdraw;
    }
  }

  public static void main(String[] args){
    // Step 1: Create your two ATMs here
ATM firstATM = new ATM(1000);
ATM secondATM = new ATM(500);
System.out.println(firstATM.money); //1000
System.out.println(secondATM.money); //500
    // Step 3: Print your static variable in three different ways here
    System.out.println(ATM.totalMoney); //0
    System.out.println(firstATM.totalMoney); //0
    System.out.println(secondATM.totalMoney); //0
  }
//Right now the value stored in totalMoney doesn’t actually represent the total amount of money stored in all ATMs.
}


// Example with class Dog
// public class Dog{

// Since all dogs share the same genus, we could use a static variable to store that information for
// the entire class. However, we want each dog to have its own unique name and age, so those aren’t static
//   // Static variables
//   public static String genus = "Canis";
 
//   //Instance variables
//   public int age;
//   public String name;
 
//   public Dog(int inputAge, String inputName){
//     this.age = inputAge;
//     this.name = inputName;
//   }
// }

//Unlike static methods, you can still access static variables from a specific object of the class.
// However, no matter what object you use to access the variable, the value will always be the same.
// public static void main(String[] args){
//   Dog snoopy = new Dog(3, "Snoopy");
//   Dog ringo = new Dog(5, "Ringo");
 
//   System.out.println(Dog.genus); // Prints Canis
//   System.out.println(snoopy.genus); // Prints Canis
//   System.out.println(ringo.genus); // Prints Canis
// }