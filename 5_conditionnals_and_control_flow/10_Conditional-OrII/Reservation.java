// Conditional-Or: ||

// at least one condition is true --> the whole is true

// Here’s one way we could write the code:
// if (hasAlgebraPrerequisite) {
//   // Enroll in course
// } 
// if (hasGeometryPrerequisite) {
//   // Enroll in course
// }
//We can be more concise with the OR operator:
// if (hasAlgebraPrerequisite || hasGeometryPrerequisite) {
//   // Enroll in course
// }
// The OR operator, ||, is used between two boolean values and evaluates to a single boolean value.
// If either of the two values is true, then the resulting value is true, otherwise the resulting value is false.



// true || true --> true
// false || true --> true
// true || false --> true
// false || false --> false


//If the first operand of an expression is true, 
//we don’t need to see what the value of the other operand is to know that the final value will also be true
// if (1 > 0 || 2 / 0 == 7) {
//   System.out.println("No errors here!");
// } //we can run the following code without error despite dividing a number by 0 in the second operand
// because the first operand had a true value:

public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public Reservation(int count, int capacity, boolean open) {
    // Write conditional statement below
    if ( count<1 || count >=8){
      System.out.println("Invalid reservation!");
    }
    
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }  
  
  public void confirmReservation() {
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
			isConfirmed = false;
    }
  }
  
  public void informUser() {
    System.out.println("Please enjoy your meal!");
  }
  
  public static void main(String[] args) {
    Reservation partyOfThree = new Reservation(3, 12, true);
    Reservation partyOfFour = new Reservation(4, 3, true);
    partyOfThree.confirmReservation(); // reservation confirmed
    partyOfThree.informUser(); // Please enjoy your meal!
    partyOfFour.confirmReservation(); // Reservation denied
    partyOfFour.informUser(); // Please enjoy your meal!
  }
}