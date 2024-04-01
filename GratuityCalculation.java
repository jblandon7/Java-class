
public class GratuityCalculation {
  public static void main(String[] args){
    
    //Create a variable to print result
    int result = sumDigits(234);
    
    //Print result
    System.out.println(result);
}

public static int sumDigits(long n) {
  
  //Create a loop until each digit
  int sum = 0;
  
  //Create a function to add all digits
    do {
        int digit = (int) (n % 10);
        sum += digit;
        n /= 10;
    }
   
  //Stop loop until the digit is 0
   while (n != 0); 
   return sum;
 
   }
}

