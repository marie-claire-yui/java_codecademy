public class Person{
    //three instance variables 
  public int age;
  public int wisdom;
  public int fitness;

  // initializing of the 3 instance variables to different values when the constructor is called
  public Person(int inputAge){
    this.age = inputAge;
    this.wisdom = inputAge * 5;
    this.fitness = 100 - inputAge;
  }

  public void setAge(int newAge){
    this.age = newAge;
  }

  public void setWisdom(int newWisdom){
    this.wisdom = newWisdom;
  }

  public void setFitness(int newFitness){
    this.fitness = newFitness;
  }

  public void hasBirthday(){
    //Complete this method
//call the mutator methods to increase age by 1, increase wisdom by 5, and decrease fitness by 3
// This method calls other methods from the class. (the setters methods)
//But it needs an object to call those methods! Rather than create a new object  we use this as the object.
// means that the object that calls hasBirthday() will be used to call setAge, setWisdom, and setFitness
 
this.setAge(this.age + 1);
this.setWisdom(this.wisdom + 5);
this.setFitness(this.fitness -3);
  }

  public static void main(String[] args){
    Person emily = new Person(20);
    // in this example, calling emily.hasBirthday is as if we called
    // emily.setAge(), emily.setWisdom, and emily.setFitness
    // this serves as a placeholder for whatever object was used to call the original method.
    emily.hasBirthday();
    System.out.println("New age is: " + emily.age); //New age is: 21
    System.out.println("New wisdom is: " + emily.wisdom); //New wisdom is: 105
    System.out.println("New fitness is: " + emily.fitness); //New fitness is: 77
  }
}

// Keep Reading: AP Computer Science A Students
//this can be used as a value for a parameter
// public void pairWithOtherComputer(Computer other){
//   // Code for method that uses the parameter other
// }
 
// public void setUpConnection(){
//   // We use "this" to call the method and also pass "this" to the method so it can be used in that method
//   this.pairWithOtherComputer(this);
// }
//You’re using the current object to call the method and are passing that object as that method’s parameter.