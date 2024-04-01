import java.util.*;

public class Order{
public static void main(String[] args){
    //Create scanner class
    Scanner input = new Scanner(System.in);
    //Ask the user to put in three numbers
    System.out.println("Enter three numbers and seperate them with a space: ");
    //retrieve all three numbers seperatly
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();
    double num3 = input.nextDouble();
    //Call the method
    displaySortedNumbers(num1, num2, num3);
    input.close();
}
//Create method to sort
public static void displaySortedNumbers(double num1, double num2, double num3){
    double[] numbers = {num1, num2, num3};
    //Sort the numbers with an array
    Arrays.sort(numbers);
    System.out.println("Numbers in sorted order: ");
    for (double num : numbers) {
        System.out.println(num);
}
}
}