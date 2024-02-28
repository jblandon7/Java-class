import java.util.*;


public class ComputeAreaOfAHexagon {
    public static void main(String[] args){
        
        //Create a scanner class
        Scanner input = new Scanner(System.in);
        
        //ask the user to put in the length of oone side of the Hexagon
        System.out.print("Enter the length of one side of the Hexagon: ");
        
        //Retrieve the input from user
        double Length = input.nextDouble();
        
        //Calculate the Area of a Hexagon
        double AreaofHexagon = (6 * (Math.pow(Length, 2))) / (4 * (Math.tan(Math.PI/6))); 

        //print the result to the user
        System.out.print("The area of the Hexagon is: " + AreaofHexagon);

        input.close();
    }
}
