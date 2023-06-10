import java.util.Arrays;

public class Classroom {
  
  public static void main(String[] args){
//make a String array called students, and set it equal to the following students, in order: Sade, Alexus, Sam, Koma
    String[] students = {"Sade","Alexus","Sam","Koma"};
// Create an array called mathScores and set it to an empty array of size 4. It should hold double
    double[] mathScores = new double[4];
    mathScores[0] = 94.5;// Sade got a 94.5 on the test. Store this value in the 0th index of the mathScores array.
    mathScores[2] = 76.8;// Sam got a 76.8 on the test. Store this value in the appropriate spot in mathScores array.
    System.out.println("The number os students in the class is "+ students.length +".");
  } // output: Output: The number os students in the class is 4.
}
