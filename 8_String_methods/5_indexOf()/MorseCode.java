//indexOf()

// If we want to know the index of the first occurence of a character in a string, 
//we can use the indexOf() method on a string.

public class MorseCode {
  
  public static void main(String[] args) {
    
    String code = ".... .. / .. .----. -- / ... --- -. -. -.-- / .- -. -.. / .. / .-.. .. -.- . / - --- / . .- - / .-. .- -- . -.";

    // Write the code:
    System.out.println(code.indexOf(". .- -")); //87
    
  }
  
}