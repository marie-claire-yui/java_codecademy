// break and continue



//break 
//The break keyword is used to exit, or break, a loop. 
//Once break is executed, the loop will stop iterating. 
// for (int i = 0; i < 10; i++) {
//   System.out.println(i);
//   if (i == 4) {
//     break;
//   }
// }
// output  until 4

// continue
// If continue is executed, the current loop iteration will immediately end, and the next iteration will begin.
// int[] numbers = {1, 2, 3, 4, 5};
 
// for (int i = 0; i < numbers.length; i++) {
//   if (numbers[i] % 2 == 0) {
//     continue;
//   }
//   System.out.println(numbers[i]);
// }
// print 1,3,5


class Numbers {
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      // Add your code below
      if(i%5!=0){ //condition that checks if i is not divisible by 5.
        continue; // If the condition is true, skip the iteration.
      }//Outside the condition statement, print i.
      System.out.println(i);
//The only numbers that should be printed are those that are divisible by 5!
      
    }
  }
}

//Loops can exist all throughout our code - including inside a method.
// If the return keyword was executed inside a loop contained in a method, 
//then the loop iteration would be stopped and the method/constructor would be exited.


// public static boolean checkForJacket(String[] lst) {
//   for (int i = 0; i < lst.length; i++) {
//     System.out.println(lst[i]);
//     if (lst[i] == "jacket") {
//       return true;
//     }
//   }
//   return false;
// } 
 
// public static void main(String[] args) {
//   String[] suitcase = {"shirt", "jacket", "pants", "socks"};   
//   System.out.println(checkForJacket(suitcase));
// }

// output
// shirt
// jacket
// true