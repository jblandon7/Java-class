import java.util.*;
public class GratuityCalculation {
      public static void main(String[] args) {
        // ask the user to enter the subtotal
        System.out.println("Enter the subtotal: ");
        //ask the user to enter gratuity
        System.out.println("Enter the amount of gratuity: ");
       //create a scanner  
        Scanner input = new Scanner(System.in);
       // retrieve subtotal from input
        double subtotal = input.nextDouble(); 
        //retrieve gratuity from input 
        double gratuityRate =input.nextDouble();
        //calculate gratuity  
        double gratuity = subtotal *(gratuityRate / 100);
        //calculate total with gratuity added on 
        double totalamount = subtotal + gratuity;
        //print the gratuity
        System.out.println("The gratuity is: " + gratuity);
        //print the totalamount
        System.out.println("The added gratuity is: " + totalamount);
    
        input.close(); 
      }
    
     
    }

