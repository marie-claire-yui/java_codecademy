// Creating an array explicitly
// To create an array, we provide a name and declare the type of data it holds: 
// ex: double[] prices = {13.15, 15.87, 14.22, 16.66};

public class Newsfeed {
  
  
  public Newsfeed(){
    
  }
  
  // Create getTopics() below:
  public String[] getTopics(){
    String[] topics = {"Opinion","Tech","Science","Health"};
    return topics;
  }

  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    
    String[] topics = sampleFeed.getTopics();
    System.out.println(topics); // [Ljava.lang.String;@2aae9190 
    // (memory adress that don't help understand what is contained in the array)
    // if we want to have a more descriptive printout we need a toString() method
    // that is provided by the Arrays package in java : import java.util.Arrays;
  }
}