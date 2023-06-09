// Review

public class Review{

    public static void main(String[] args) {
        // Conditional-AND, &&, evaluates to true if the booleans on both sides are true.
        if (true && false) {
        System.out.println("You won't see me print!");
        } else if (true && true) {
        System.out.println("You will see me print!"); //You will see me print!
        }

        // Conditional-OR, ||, evaluates to true if one or both of the booleans on either side is true.
        if (false || false) {
        System.out.println("You won't see me print!");
        } else if (false || true) {
        System.out.println("You will see me print!"); //You will see me print!
        }
        
        //Logical-NOT, !, evaluates to the opposite boolean value to which it is applied.
        if (!false) {
        System.out.println("You will see me print!"); // You will see me print!
        }
    }
}