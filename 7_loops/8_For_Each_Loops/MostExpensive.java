// ForEach loops

// For-each loops, which are also referred to as enhanced loops, 
//allow us to directly loop through each item in a list of items (like an array or ArrayList) 
//and perform some action with each item

// for loop
// for (int inventoryItem = 0; inventoryItem < inventoryItems.length; inventoryItem++) {
//   // Print element at current index
//   System.out.println(inventoryItems[inventoryItem]);
// }

//For-each loops, which are also referred to as enhanced loops,
// allow us to directly loop through each item in a list of items (like an array or ArrayList) 
//and perform some action with each item. 
// for (String inventoryItem : inventoryItems) {
//   // Print element value
//   System.out.println(inventoryItem);
 
// }
//We can read the : as “in” like this: for each inventoryItem (which should be a String) in inventoryItems, 
//print inventoryItem. 
//If we try to assign a new value to the enhanced for loop variable,
// the value stored in the array or ArrayList will not change. This is because, for every iteration in the enhanced loop, 
//the loop variable is assigned a copy of the list element. 

import java.util.ArrayList;

class MostExpensive {
  
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
    
    double mostExpensive = 0;
    
    // Iterate over expenses
    //for-each loop that iterates through each expense in expenses
    for (double expense : expenses ){
    if(expense>mostExpensive){ //Inside the for-each loop, check if expense is greater than mostExpensive. 
      mostExpensive = expense; //If it is, set mostExpensive equal to expense.
    }
    System.out.println(mostExpensive);
    // Let’s use a for-each loop to find the priciest item in expenses.
  }
  }
}