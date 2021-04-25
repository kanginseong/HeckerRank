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
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        int[] ar = new int[16];
        int c = 0;
        
        for(int k=0; k<4; k++){
            for(int l=0; l<4; l++){
                ar[c] = arr[k][l] + arr[k][l+1] + arr[k][l+2] + arr[k+1][l+1] + arr[k+2][l] + arr[k+2][l+1] + arr[k+2][l+2];
                c++;
            }
        }
        
        int o = ar[0];
        
        for(int u=1; u<16; u++) {
            if(o < ar[u])
                o = ar[u];
        }
        
        System.out.println(o);
        

        scanner.close();
    }
}
