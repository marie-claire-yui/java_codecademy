// Static Methods Refresher

// Static methods are methods that belong to an entire class, not a specific object of the class.
// Static methods are called using the class name and the . operator.

public class ExerciseOne{
  public static void main(String[] args){

    int randomNum = (int)(Math.random() * 10) + 1;
    System.out.println("Your random number between one and ten is " + randomNum);
    
    int negativeNum = -2;
    int absNum = Math.abs(negativeNum);
    System.out.println("The absolute value of "+ negativeNum + " is " + absNum);

    String myNewString = Integer.toString(1);
    System.out.println(myNewString);

  }
}

// Your random number between one and ten is 1
// The absolute value of -2 is 2
// 1