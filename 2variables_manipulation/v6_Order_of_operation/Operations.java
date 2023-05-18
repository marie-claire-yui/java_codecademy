public class Operations {
	public static void main(String[] args) { 

    int expression1 = 5 % 2 - (4 * 2 - 1);
     System.out.println(expression1); //-6 attention au int!

    int expression2 = (3 + (2 * 2 - 5)) + 6 - 5; //3
     System.out.println(expression2);

    int expression3 = 5 * 4 % 3 - 2 + 1; //1
     System.out.println(expression3);

	}
}

// The order is as follows:

//     Parentheses
//     Exponents
//     Modulo/Multiplication/Division
//     Addition/Subtraction
