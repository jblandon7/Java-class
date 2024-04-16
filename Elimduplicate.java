import java.util.*;

public class Elimduplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter ten digits seperated by a space: ");
          for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        int[] distinctNumbers = eliminateDuplicates(numbers);
        System.out.println("Distinct numbers: ");
        for (int num : distinctNumbers){
            System.out.println(num);
        }
    }
    public static int[] eliminateDuplicates(int[] arr){
        
        Arrays.sort(arr);
        int len = arr.length;
        int[] temp = new int[len];
        int j = 0;
        
        for (int i = 0; i < len - 1; i++){
            if (arr[i] != arr[i + 1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[len-1];
        int[] result = new int[j];

        for (int k = 0; k < j; k++) {
            result[k] = temp[k];
        }
        return result;
    }
}
