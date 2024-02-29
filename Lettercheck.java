import java.util.*;

public class Lettercheck{
        public static void main(String[] args) {
            // Insert the scanner class
            Scanner input = new Scanner(System.in);
            
            //Read input as letter variable
            String letter;
            
            //Create a loop to check if user has put in a letter
            do {
                //Ask the user for a letter
                System.out.print("Enter a letter to check if it is a Consonant or a vowel: ");
                
                //Retreive the input from the user 
                letter= input.nextLine();
            }
            
            //Check if user has put in a letter
            while (!letter.matches("[a-zA-Z]")); 
            
            //check if letter is vowel or consonant
            if (letter.matches("[aeiouAEIOU]")) { 
                System.out.print("This is a vowel");
            } else {
                System.out.print("This is a consonant");
            }
            input.close();
            }
}