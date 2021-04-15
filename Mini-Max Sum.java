import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        
        long maxNum = arr[0];
        long minNum = arr[0];
        long arrSum = 0;
        
        for(int i=0; i<arr.length; i++){
            if(maxNum < arr[i])
                maxNum = arr[i];
            else if(minNum > arr[i])
                minNum = arr[i];
            
            arrSum += arr[i];
        }
        
        System.out.print(arrSum - maxNum + " ");
        System.out.println(arrSum - minNum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
