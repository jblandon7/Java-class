import java.util.*;
public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        //Create a scanner class
        Scanner input = new Scanner(System.in);
         
        //ask for the users weight in pounds
        System.out.print("Enter Your weight in Pounds: ");
         
        //retrieve weight in pounds
        double pounds = input.nextDouble();
         
        //ask for the users height in Feet
        System.out.print("Enter your height in Feet: ");
         
        //retrieve height in feet
        int feet = input.nextInt();
         
        //ask for the height in inches
        System.out.print("Enter your height in Inches: ");
         
        //retrieve height in inches
        int inches = input.nextInt();
         
        //Convert Feet into inches
        double FeetToInches = feet * 12; 
        
        //Add the conversion of feet to inches to inches input
        double height = FeetToInches + inches;
        
        //calculate for BMI
        double BMI = 703 * (pounds / (height * height));
         
        // calculation for BMI
        System.out.print(" BMI is "+ BMI);
        
        //Create If statement to determine BMI Category
        if (BMI <= 18.5) {
            System.out.print(" Underweight");
        } else if (BMI >= 18.5 && BMI <= 24.9){
            System.out.print(" Healthy Weight/Normal");
        } else if (BMI >= 25.0 && BMI <= 29.9){
            System.out.print(" Overweight");
        } else{
            System.out.print(" Obese");
        }
        input.close();
    }

}
