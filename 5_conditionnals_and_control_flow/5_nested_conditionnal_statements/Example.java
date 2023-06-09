//  nested conditional statements
// When we implement nested conditional statements, the outer statement is evaluated first. 
// If the outer condition is true, then the inner, nested statement is evaluated.

public class Example{

    public static void main(String[] args) {
            int temp = 45;
        boolean raining = true;
        if (temp < 60) {
         System.out.println("Wear a jacket!");
            if (raining == true) {
             System.out.println("Bring your umbrella.");
            } else {
            System.out.println("Leave your umbrella home.");
            }
        }
    }
}
// rq: instance fields here should be placed in the psvm 
// indeed, we are usingthem directly in the psvm