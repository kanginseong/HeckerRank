import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        
        int plus = 0;
        int minus = 0;
        int zero = 0;
        double arrL = arr.length;
        
        for(int i = 0; i < arrL; i++){
            if (arr[i] > 0)
                plus++;
            else if (arr[i] < 0)
                minus++;
            else
                zero++;
        }
        
        System.out.printf("%.6f\n",(plus/arrL));
        System.out.printf("%.6f\n",(minus/arrL));
        System.out.printf("%.6f\n",(zero/arrL));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
