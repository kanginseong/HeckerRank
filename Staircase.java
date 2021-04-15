import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        
        // for(int i=n-1; i>0; i--){
        //     for(int j=0; j<i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=i; k<0; k--){
        //         System.out.print("3");
        //     }
        //     System.out.println();
        // }
        
        for(int i= 0; i < n; i++) {
            for(int j = 0; j< n; j++) {
                 if(j>=n-i-1)System.out.print("#");
                 else System.out.print(" ");
            }
            System.out.println("");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
