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
        
        int ar[] = new int[16];
        int c = 0;
        for(int y=0; y<4; y++)
        {
            for(int x=0; x<4; x++)
            { 
                ar[c++]=arr[y][x]+arr[y][x+1]+arr[y][x+2]+arr[y+1][x+1]+arr[y+2][x]+arr[y+2][x+1]+arr[y+2][x+2];
            }
        }
        int l=ar[0];
        for(int x=1;x<16;x++)
        {
            if(ar[x]>l)
            {
                l=ar[x];
            }
        }
        System.out.println(l);

        scanner.close();
    }
}
