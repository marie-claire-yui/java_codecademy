public class Zoo {
  	public static void main(String[] args){
      int animals = 12;
      String species = "zebra";
      String zooDescription = "Our zoo has " + animals +" "+species+"s!";
      System.out.println(zooDescription);
    }       
}
// The + operator, which we used for adding numbers together, can be used to concatenate Strings.
// We can even use a primitive datatype as the second variable to concatenate, and Java will intelligently make it a String first:
