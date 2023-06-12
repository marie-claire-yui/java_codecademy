import java.util.ArrayList;

public class Car{


    public static void main(String[] args) {
    
    
        ArrayList<Car> carShow = new ArrayList<Car>();
        //When using ArrayList methods (like add()), 
        //the reference parameters and return type of a method must match the declared element type of the ArrayList
        //ArrayList comes with an add() method which inserts an element into the structure
        // In this example, we’ll add objects from the Car class to an ArrayList called carShow
        carShow.add(ferrari); // carShow now holds [ferrari]
        carShow.add(thunderbird); // carShow now holds [ferrari, thunderbird]
        carShow.add(volkswagen); // carShow now holds [ferrari, thunderbird, volkswagen]

        // Insert object corvette at index 1
        carShow.add(1, corvette); // carShow now holds [ferrari, corvette, thunderbird, volkswagen]
        // Insert object porsche at index 2
        carShow.add(2, porsche); // carShow now holds [ferrari, corvette, porsche, thunderbird, volkswagen]



        //In the following snippet, assortment is an ArrayList that can store different values 
        //because we do not specify its type during initialization.
        ArrayList assortment = new ArrayList<>();
        assortment.add("Hello"); // String
        assortment.add(12); // Integer
        assortment.add(ferrari); // reference to Car
        // assortment holds ["Hello", 12, ferrari]
        //In this case, the items stored in this ArrayList will be considered Objects.
        // As a result, they won’t have access to some of their methods without doing some fancy casting.

        //Although this type of ArrayList is allowed, using an ArrayList that specifies its type is preferred.
    }
}