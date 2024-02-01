
import java.util.*;
public class CelsiustoFahrenheitconversion {
  public static void main(String[] args) {
    // ask the user for celsius input
    System.out.println("Enter a degree in Celsius: ");
    //Create a scanner 
    Scanner input = new Scanner(System.in);
    // retrieve celsius from input
    double celsius = input.nextDouble(); 
    //calculate celsius to fahrenheit 
    double fahrenheit = (9.0 / 5) * celsius + 32;
    //print the results
    System.out.println("The degress in fahrenheit is: " + fahrenheit);

    input.close(); 
  }

 
}
