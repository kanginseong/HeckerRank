import java.io.*;
import java.util.*;

public class Solution {

    public static String upperCaseFirst(String val) {
        char[] arr = val.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return new String(arr);
   }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int first = A.length() + B.length();
        System.out.println(first);
        
        int second = A.compareTo(B);
        if(second > 0) 
            System.out.println("Yes");
        else 
            System.out.println("No");
        
        String third = upperCaseFirst(A) + " " + upperCaseFirst(B);
        System.out.println(third);
        
        // System.out.println(A.length() + B.length());
        // if (A.compareTo(B) > 0) {
        //     System.out.println("Yes");
        // } else {
        //     System.out.println("No");
        // }
        // A = A.substring(0, 1).toUpperCase() + A.substring(1);
        // B = B.substring(0, 1).toUpperCase() + B.substring(1);
        // System.out.println(A + " " + B);
        
    }
}



