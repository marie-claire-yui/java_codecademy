// Removing Elements During Traversal

//When an element is removed from an ArrayList, all the items that appear after the removed element will have
// their index value shift by negative one — it’s like all elements shifted to the left!
//We’ll have to be very careful with how we use our counter variable to avoid skipping elements.

//Removing An Element Using while
// int i = 0; // initialize counter
 
// while (i < lst.size()) {
//   // if value is odd, remove value
//   if (lst.get(i) % 2 != 0){
//     lst.remove(i);
//   } else {
//     // if value is even, increment counter
//     i++;
//   }
// }

//Removing An Element Using for
//When using a for loop, we, unfortunately, must increase our loop control variable 
//— the loop control variable will always change when we reach the end of the loop
//Since we can’t avoid increasing our loop control variable, we can take matters into our own hands 
//and decrease the loop control variable whenever we remove an item.
// for (int i = 0; i < lst.size(); i++) {
//   if (lst.get(i) == "value to remove"){
//     // remove value from ArrayList
//     lst.remove(lst.get(i));
//     // Decrease loop control variable by 1
//     i--;    
//   }
// }

//Note: Avoid manipulating the size of an ArrayList when using an enhanced for loop. 
//Actions like adding or removing elements from an ArrayList when using a for each loop can cause
// a ConcurrentModificationException error.

import java.util.ArrayList;

class Lunch {
 
  public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
    // Add your code below
     for (int i=0; i<lunchBox.size();i++){
       if (lunchBox.get(i)=="ant"){
         lunchBox.remove(i);
         i--;
         }
     } 
     return lunchBox;
   }
//  Inside the method removeAnts(), use a for loop or a while loop to iterate through lunchBox 
//and remove any element that has the value "ant".
// Outside the loop, return the value of lunchBox.
  
  public static void main(String[] args) {
    ArrayList<String> lunchContainer = new ArrayList<String>();
    lunchContainer.add("apple");
    lunchContainer.add("ant");
    lunchContainer.add("ant");
    lunchContainer.add("sandwich");
    lunchContainer.add("ant");
    lunchContainer = removeAnts(lunchContainer);
    System.out.println(lunchContainer); //[apple, sandwich]

  }
}