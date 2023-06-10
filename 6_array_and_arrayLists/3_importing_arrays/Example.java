
import java.util.Arrays;
// We put this at the top of the file, before we even define the class!
// When we import a package in Java, we are making all of the methods of that package available in our code
// The Arrays package has many useful methods, including Arrays.toString(). 
// When we pass an array into Arrays.toString(), we can see the contents of the array printed out:
public class Example {
    public static void main(String[] args){
    int[] lotteryNumbers = {4, 8, 15, 16, 23, 42};
    String betterPrintout = Arrays.toString(lotteryNumbers);
    System.out.println(betterPrintout); //[4, 8, 15, 16, 23, 42]
  }
}
