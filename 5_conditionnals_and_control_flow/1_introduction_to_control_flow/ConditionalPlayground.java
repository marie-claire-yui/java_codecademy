public class ConditionalPlayground {

    //Imagine we’re writing a program that enrolls students in courses.
    //If a student has completed the prerequisites, then they can enroll in a course.
    //Else, they need to take the prerequisite courses.
    //They can’t take Physics II without finishing Physics 

    // We represent this kind of decision-making in our program using conditional or control flow statements.
    // Before this point, our code runs line-by-line from the top down, 
    // but conditional statements allow us to be selective in which portions will run. 

  public static void main(String[] args) {
 // Conditional statements check a boolean condition and run a block of code depending on the condition.
 // Curly braces mark the scope of a conditional block similar to a method or class.
    if (true) {
        System.out.println("Hello World!");
        } // this code runs So Hello World! is printed. 

     //   if (false) {
     //   System.out.println("Hello World!");
     //   } // If the condition is false, then the block does not run.
  }
}