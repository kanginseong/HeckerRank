import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        // String a2 = Integer.toBinaryString(n);
        // String[] binaryArr = a2.split("");
        
        // int count = 1;
        
        // for(int i=0; i<binaryArr.length; i++){
            
        //     int compare = i;
        //     int compare1 = i+1;
            
        //     if(compare1 >= binaryArr.length){
        //         if(binaryArr[compare] == binaryArr[compare])
        //             count++;
        //     }
        //     else{
        //         if(binaryArr[i] == binaryArr[i+1])
        //             if(count == 1)
        //                 count = 1;
        //             else
        //                 count++; 
        //         else
        //             count = 1; 
        //     }   
        // }
        // System.out.println(count);
        
        int count = 0, max = 0;
        
        while(n>0) {
            if(n % 2 == 1) {
                count++;
                if(count > max) 
                    max = count;  
            }
            else
                count = 0;
            n /= 2;
        }
        
        System.out.println(max);
        scanner.close();
    }
}
