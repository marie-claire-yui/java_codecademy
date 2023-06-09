// switch statement
// This conditional will check a given value against any number of conditions 
// and run the code block where there is a match.

public class Example{

    public static void main(String[] args) {
        String course = "History";
 // This example enrolls the student in History class by checking the value contained in the parentheses, course,
 // against each of the case labels
 // If the value after the case label matches the value within the parentheses, the switch block is run.
 // IF no value matches, the default block runs. Think of this as the else equivalent.
        switch (course) {
            case "Algebra": 
            System.out.println("Enroll in Algebra");
            break; 
        case "Biology": 
           System.out.println("Enroll in Biology");
             break;
        case "History": 
            System.out.println("Enroll in History");
         break;
        case "Theatre":
            System.out.println("Enroll in Theatre");
        break;
        default:
            System.out.println("Course not found");
            }
        // we use the break keyword to exit the switch statement. 
        // Without break, code below the matching case label is run, 
        // including code under other case labels, which is rarely the desired behavior.
    }
}