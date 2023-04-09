package activities;
import java.util.*;
public class Activity2 {
    public static void main(String[] args) {

        int[] Array1 = {10, 77, 10, 54, -11, 10};
        System.out.println("Array: " + Arrays.toString(Array1));
        int searchNum = 10;
        int fixedSum = 30;
        System.out.println("Result: " + result(Array1, searchNum, fixedSum));
    }
    public static boolean result(int[] numbers, int searchNum, int fixedSum) {
        int sum = 0;
        for(int i=0; i< numbers.length ;i++)
        {
            if ( numbers[i] == searchNum) {
                sum += searchNum;
            }

            if (sum > fixedSum) {
                break;
            }
        }
        return sum == fixedSum;
    }
}
