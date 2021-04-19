import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<count; i++){
            String s = sc.nextLine();
            String odd = "";
            String even = "";
            
            for(int j=0; j<s.length(); j++){
                if(j % 2 == 0)
                    even += s.substring(j, j+1);    
                else
                    odd += s.substring(j, j+1);
            }
            System.out.println(even + " " + odd);
        }
    }
}
