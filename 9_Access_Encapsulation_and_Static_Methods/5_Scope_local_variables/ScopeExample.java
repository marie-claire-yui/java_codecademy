// The scope

//determines what parts of your code can access that variable.


public class ScopeExample{
  public static void main(String[] args){

    int[] myArray = {1, 2, 3, 4};
    int sum = 0;  
    for(int i = 0; i < myArray.length; i++){
      // int sum = 0 should be placed outside the for, or the print won't access it because of the scope
      // this is a syntactical error
      // there is also a logical error, because sum gets reset back to 0 everytime the loops run
      sum += myArray[i];
    }

    System.out.println(sum);
  }
}