// Creating an Empty Array

// We can also create empty arrays and then fill the items one by one. 
// Empty arrays have to be initialized with a fixed size: 
// Once you declare this size, it cannot be changed! Here size 5
    // String[] menuItems = new String[5];
// After declaring and initializing, we can set each index of the array to be a different item:
    // menuItems[0] = "Veggie hot dog";
    // menuItems[1] = "Potato salad";
    // menuItems[2] = "Cornbread";
    // menuItems[3] = "Roasted broccoli";
    // menuItems[4] = "Coffee ice cream";
// same as
    // String[] menuItems = {"Veggie hot dog", "Potato salad", "Cornbread", "Roasted broccoli", "Coffee ice cream"};
// We can also change an item after it has been assigned!
// Let’s say this restaurant is changing its broccoli dish to a cauliflower one:
    // menuItems[3] = "Baked cauliflower";
// Now, the array looks like: 
    // ["Veggie hot dog", "Potato salad", "Cornbread", "Baked cauliflower", "Coffee ice cream"]

// When we use new to create an empty array, each element of the array is initialized with a specific value 
//depending on what type the element is:
    //String[] my_names = new String[5]; // my_names will contain five null
    //int[] my_ages = new int[5]; // my_ages will contain five 0s to begin with

import java.util.Arrays;

public class Newsfeed {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  String[] favoriteArticles; // We’ve declared a String array called favoriteArticles, but we haven’t initialized it yet.
  
  public Newsfeed(){
    // Initialize favoriteArticles here:
    favoriteArticles = new String[10]; 
    // In the constructor for Newsfeed, set favoriteArticles to be a new empty String array of size 10.
  }
  
  public void setFavoriteArticle(int favoriteIndex, String newArticle){
    // Add newArticle to favoriteArticles:
favoriteArticles[favoriteIndex] = newArticle;
// set the value of the favoriteArticles array at index favoriteIndex to be the value of newArticle.
    
  }
    
  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    
    sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
    sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
    sampleFeed.setFavoriteArticle(0, "Oil News");
    
    System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
  } //[Oil News, null, Humans: Exterminate Or Not?, Organic Eye Implants, null, null, null, null, null, null]
}