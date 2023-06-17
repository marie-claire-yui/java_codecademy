// Writing Your Own Static Methods


// to create a static method, use the static keyword in the method’s definition.
//Just like with variables, this keyword usually comes after public or private.
//Often times, you’ll see static methods that are accessors or mutators for static variables.

// One important rule to note is that static methods can’t interact with non-static instance variables.


public class Dog{

    static int age;

   static  public Dog(int sai){
        this.age = sai;
    }

    public static void main(String[] args) {
        Dog jungle = new Dog(5);
        System.out.println(jungle.age);
    }
}

//if age were static, that would mean that the variable belongs to the entire class, not a specific object. 
//The this keyword can’t be used by a static method since static methods are associated with an entire class, 
// not a specific object of that class. 

//If you try to mix this with a static method, 
//you’ll see the error message non-static variable this cannot be referenced from a static context