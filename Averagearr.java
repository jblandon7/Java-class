import java.util.*;/**
 * Averagearr
 */
public class Averagearr {
    public static void main(String[] args) throws Exception{
        
        //Create a scanner class
        Scanner input= new Scanner(System.in);
        
        //Create an array that can holds 10 doubles
        double[] numbers = new double[10];

        //Ask for input from the user
        System.out.println("Enter ten double values and seperate them with a space: ");

        //Create a loop that can retrieve the input as an array from the user
        for (int i = 0; i < numbers.length; i++)
        {                    
            numbers[i]=input.nextDouble();
        }

        //Print the average of the array
        System.out.println("Average: " + average(numbers));
    }
    
    //Calculate the array as an integer
    public static int average(int[] array){
        int sum = 0;
        
        //Get the sum of the array
        for (int i = 0; i < array.length; i++){
            
                sum += array[i]; 
        }
        return sum / array.length; 
    }
    
    //Calculate the array as a double
    public static double average(double[] array){
        
        double sum = 0;
        
        //Get the sum of the array as a double
        for (int i = 0; i < array.length; i++){
           
            sum += array[i];
        }
       
        return sum / array.length;
    }
}