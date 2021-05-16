import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean YorN= true;
        /* Enter your code here. Print output to STDOUT. */
        for(int i=0; i<A.length()/2; i++){
            if(A.charAt(i) != A.charAt(A.length() - i - 1)){
                YorN = false;
                break;
            }
        }
        
        if(YorN == false)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
