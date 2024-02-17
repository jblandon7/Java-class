
import java.util.*;
public class Monthdayreturn {
    public static void main(String arg[]){
        //create calendar object
        Calendar calendar = Calendar.getInstance();
        //create a scanner
        Scanner input = new Scanner(System.in); 
        //ask the user for a year
        System.out.print("Enter a year: ");
        // retrieve year
        int year = input.nextInt();
        //ask the user for the month
        System.out.print("Enter a month as a number: ");
        //Retrieve month
        int month = input.nextInt();
        // Set Month and year of the calendar 
        calendar.set(Calendar.YEAR, year);
        //search through calendar to return day
        calendar.set(Calendar.MONTH, month - 1);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        //Print the number of days in month
        System.out.println("Number of days in " + month + " " + year + " is " + daysInMonth );
        
        input.close();
    }
    
}
