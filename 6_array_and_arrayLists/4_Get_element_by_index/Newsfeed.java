import java.util.Arrays;

public class Newsfeed {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0}; //each instance starts with an array of zeros called views as an instance field.
  
  public Newsfeed(){

  }
    
  public String[] getTopics(){
    return topics;
  }
  
  public String getTopTopic(){
    // get values from a array: we use sware brackets [] to access data at a certain index
    return topics[0]; // get the first element with the index 0 of the array named topics
  }//rq:access an element outside of its appropriate index range --> receive an ArrayIndexOutOfBoundsException error. 
  
  public void viewTopic(int topicIndex){
    //Every time someone views a topic, we want to increment the value of the appropriate field in views.
    views[topicIndex] = views[topicIndex] + 1;
  }

  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    
    System.out.println("The top topic is "+ sampleFeed.getTopTopic());
    
    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(3);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(1);
    
    System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!");
    
  }
}