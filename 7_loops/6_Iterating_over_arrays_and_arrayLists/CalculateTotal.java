import java.util.ArrayList;

class CalculateTotal {
  
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
    
    double total = 0;
    
    // Iterate over expenses for loop to iterate over expenses and sum up the total of all items.
    for (int i = 0 ; i < expenses.size(); i++){
      total += expenses.get(i);
    //   Start with the skeleton of a for loop:
    // Initialize a counter i with a value of 0.
    // The loop should run while i is less than the size() of expenses.
    // Increment i.

    //Inside the for loop, add the item’s value to total.

    }
    
    System.out.println(total);
    
  }
  
}

//Iterating Over Arrays and ArrayLists

// In order to traverse an array or ArrayList using a loop, we must find a way to access each element via its index.
// We may recall that for loops are created with a counter variable. 
//We can use that counter to track the index of the current element as we iterate over the list of data. 

// example: iterating through an array
// for (int i = 0; i < secretCode.length; i++) {
//   // Increase value of element value by 1
//   secretCode[i] += 1;
// }

// Traversing an ArrayList looks very similar:
// for (int i = 0; i < secretCode.size(); i++) {
//   // Increase value of element value by 1
//   int num = secretCode.get(i);
//   secretCode.set(i, num + 1);
// }


//We can also use while loops to traverse through arrays and ArrayLists. 
//If we use a while loop, we need to create our own counter variable to access individual elements. 
//We’ll also set our condition to continue looping until our counter variable equals the list length.

// while loop through an array
// int i = 0; // initialize counter
 
// while (i < secretCode.length) {
//   secretCode[i] += 1;
//   i++; // increment the while loop
// }

// Traversing through an ArrayList with a while loop would look like this:
// int i = 0; // initialize counter
 
// while (i < secretCode.size()) {
//   int num = secretCode.get(i);
//   secretCode.set(i, num + 1);
//   i++; // increment the while loop
// }