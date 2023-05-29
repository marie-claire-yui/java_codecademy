public class Example{
//The conditional structure can be chained together to check as many conditions as are required by our program. 
// Note: Only one of the code blocks will run.
    
    public static void main(String[] args) {
        //The conditional statement now has multiple conditions that are evaluated from the top down:
            String course = "Biology";
            if (course.equals("Biology")) {
                System.out.println("Enroll Biology");
            } else if (course.equals("Algebra")) {
                System.out.println("Enroll Algebra");
            } else if (course.equals("Theatre")) {
                System.out.println("Enroll Theater");
            } else {
                System.out.println("Course not found!"); 
            } // prints Enroll Biology


            //The first condition to evaluate to true will have that code block run. 
            int testScore = 72;
            if (testScore >= 90) {
            System.out.println("A");
            } else if (testScore >= 80) {
             System.out.println("B");
            } else if (testScore >= 70) {
            System.out.println("C");
            } else if (testScore >= 60) {
            System.out.println("D");
            } else {
             System.out.println("F");
            } // prints C
            //This chained conditional statement has two conditions that evaluate true.
            //Because testScore >= 70 comes before testScore >= 60, only the earlier code block is run.
    }



}