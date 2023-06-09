// Conditional-And: &&

// Here’s one way we could write the code:
// if (tuitionPaid) {
//   if (hasPrerequisite) {
//     // enroll student
//   }
// }

// we can be more concise with the AND operator:
// if (tuitionPaid && hasPrerequisite) {
//   // enroll student
// }

// This code illustrates every combination:

// true && true --> true
// false && true --> false
// true && false --> false
// false && false --> false

public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public Reservation(int count, int capacity, boolean open) {
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }  
  
  public void confirmReservation() {
    /* 
       Write conditional
       ~~~~~~~~~~~~~~~~~
       if restaurantCapacity is greater
       or equal to guestCount
       AND
       the restaurant is open:
         print "Reservation confirmed"
         set isConfirmed to true
       else:
         print "Reservation denied"
         set isConfirmed to false
    */
    if (restaurantCapacity>=guestCount && isRestaurantOpen==true){
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    }else {
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
    partyOfThree.confirmReservation(); // Reservation confirmed
    partyOfThree.informUser(); // Please enjoy your meal
    partyOfFour.confirmReservation(); // Reservation denied
    partyOfFour.informUser();// Please enjoy your meal
  }
}