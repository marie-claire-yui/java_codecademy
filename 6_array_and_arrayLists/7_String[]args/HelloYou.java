// String[] args

//When we write main() methods for our programs, we use the parameter String[] args
// public static void main(String[] args) { code }
// example of String array : String[] humans = {"Talesha", "Gareth", "Cassie", "Alex"};
// The args parameter is another example of a String array. 
//In this case, the array args contains the arguments that we pass in from the terminal when we run the class file.
// (So far, args has been empty.)


public class HelloYou {
    public static void main(String[] args) {
      System.out.println("Hello " + args[0]);  
    }
  }
  // pass arguments to main()
  //  run the file HelloYou in the terminal with an argument of "Laura": java HelloYou Laura
  // output: Hello Laura
  

