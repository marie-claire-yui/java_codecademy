public class Final {
	public static void main(String[] args) { 
      
		final double pi = 3.14;
    System.out.println(pi); //3.14
    pi = 0.07;
// Final.java:6: error: cannot assign a value to final variable pi
//     pi = 0.07;
//     ^
// 1 error
	}
}

// To declare a variable with a value that cannot be manipulated, we need to use the final keyword.
// To use the final keyword, prepend final to a variable declaration
// When we declare a variable using final, the value cannot be changed; any attempts at doing so will cause an error to occur
