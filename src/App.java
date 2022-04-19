/**
 * This program uses overloading methods
 * @author APRIL DAGDAGAN
 */
public class App {
    //overloaded computeSum() methods
    //computeSum() method that takes in two int parameters to add.
    private static int completeSum(int num1, int num2){
        return num1 + num2;
    }
    //computeSum() method that takes in 3 int parameters to add
    private static int completeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    //overloaded greaterValue() methods
    //takes 2 int parameters to compare and return whose greater
    private static int greaterValue(int a, int b){
        if(a > b){
            return a;
        } else{
            return b;
        }
    }
    //takes 2 double parameters to compare and return whose greater
    private static double greaterValue(double a, double b){
        if(a > b){
            return a;
        } else{
            return b;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        //calls completeSum method to compute 2 numbers
        System.out.println("Finding the sum of two numbers... ");
        System.out.println("The sum of 12 and 21 is " +  completeSum(12, 21));

        //calls completeSum method to compute 3 numbers
        System.out.println("Finding the sum of three numbers... ");
        System.out.println("The sum of 11, 22, and 121 is " +  completeSum(11, 22, 121));
        
        //calls greaterValue method with integer parameters
        System.out.println("\nThe greater value between 45 and 100 is " + greaterValue(45,100));
        
        //calls greaterValue method with double parameters
        System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14,9.8));
    }
}
