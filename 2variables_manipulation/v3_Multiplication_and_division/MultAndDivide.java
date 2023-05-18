public class MultAndDivide {
	public static void main(String[] args) {   
		double subtotal = 30;
    double tax = 0.0875;
    double total = subtotal + subtotal*tax;
    System.out.println(total);
    double perPerson = total / 4;
    System.out.println(perPerson);

    int evenlyDivided = 10 / 5; //evenlyDivided holds 2, because 10 divided by 5 is 2
    int unevenlyDivided = 10 / 4;//unevenlyDivided holds 2, because 10 divided by 4 is 2.5
    // It’s important to note that if we try to divide any number by 0, we will get an ArithmeticException error as a result.
    
	}
}