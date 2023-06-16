// substring()

//  part of a string, extract a substring from a string. 






public class Poetry {
  
	public static void main(String[] args) {
      
    String line = "The Heav'ns and all the Constellations rung";     
    // Change the arguments:
    System.out.println(line.substring(4, 11)); //Heav'ns
    //When substring() is called with two arguments, the first argument is inclusive and the second is exclusive.
  }
  
}


// from 24th to the end
// String line = "The Heav'ns and all the Constellations rung";
// System.out.println(line.substring(24));