// logical not: !

// The unary operator NOT, !, works on a single value. 
// This operator evaluates to the opposite boolean to which it’s applied:
// !false --> true
// !true --> false

// NOT is useful for expressing our intent clearly in programs. 
// For example, sometimes we need the opposite behavior of an if-then: 
// run a code block only if the condition is false.

public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public Reservation(int count, int capacity, boolean open) {
    if (count < 1 || count > 8) {
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
    // Write conditional here
  if (!isConfirmed){
    System.out.println("Unable to confirm reservation, please contact restaurant.");
  }else {
    System.out.println("Please enjoy your meal!");
  }
  }
  
  public static void main(String[] args) {
    Reservation partyOfThree = new Reservation(3, 12, true);
    Reservation partyOfFour = new Reservation(4, 3, true);
    partyOfThree.confirmReservation(); // Reservation confirmed
    partyOfThree.informUser(); // Please enjoy your meal!
    partyOfFour.confirmReservation(); // Reservation denied
    partyOfFour.informUser(); // Unable to confirm reservation, please contact restaurant.
  }
}