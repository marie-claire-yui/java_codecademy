// charAt()

// The charAt() method returns the character located at a String‘s specified index.

public class Initials {
  
	public static void main(String[] args) {
    
    // Add a first name and a last name:
    String firstName = "Sonny";  
    String lastName = "Li";
    
    // What are the initials?
    System.out.println(firstName.charAt(0));
    System.out.println(lastName.charAt(0));
    
  }
  
}

//Suppose we try to return the character located at index 10.
// It would produce an IndexOutOfBoundsException error because index 10 is out of range