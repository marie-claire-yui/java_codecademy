public class GreaterLessThan {
	public static void main(String[] args) {   
		double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    System.out.println(creditsEarned > creditsToGraduate);
    double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
    System.out.println(creditsToGraduate < creditsAfterSeminar);
	}
}

// Java has relational operators for numeric datatypes that make boolean comparisons.
// These include less than (<) and greater than (>)

// double balance = 20000.01;
// double amountToWithdraw = 5000.01;
// System.out.print(amountToWithdraw < balance);
// //this will print true, since amountToWithdraw is less than balance

// double myBalance = 200.05;
// double costOfBuyingNewLaptop = 1000.05;
// boolean canBuyLaptop = myBalance > costOfBuyingNewLaptop;
// //canBuyLaptop is false, since 200.05 is not more than 1000.05