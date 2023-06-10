// ARRAY LIST

// with array in java, we are limited once a array is created by a fixed size
// we can't add or remove elements
// to create mutable and dynamic lists we can use ArrayList class
// in order to do so we need to import them from java's util package: import java.util.ArrayList;

import java.util.Arrays;

class Shopping {
  
  public static void main(String[] args) {
    
    String[] groceryItems = {"steak", "milk", "jelly beans"};
    double[] prices = {25.00, 2.95, 2.50};
    
    // We’ve tried to add a new item to the end of each array
    groceryItems[3] = "ham"; // Index 3 out of bounds for length 3
    prices[3] = 4.99;
    // It's not working because the size is 3 when we created the arrays
  }
  
}