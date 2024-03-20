
public class miltokil {
    public static void main(String[] args) throws Exception{
    //Create title for the table 
    System.out.println("Miles\tKilometers");
        
        //create a function that converts miles to kilometers that is 1-10
    for (int miles = 1;miles <= 10; miles++){
        double kilometers = miles * 1.609;

        // Print accurate conversion on table with correct format
        ystem.out.printf( "%d\t%.3f\n",miles, kilometers);
        }
    }
}

