import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'findRange' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER num as parameter.
     */

    public static long findRange(int num) {
    // Write your code here
        long maximum = 0;
        long minimum = 0;
        
        int[] n1 = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        int[] n2 = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        
        // maximum
        int x = 0;
        for(int i=0; i<n1.length; i++){
            if(n1[i] != 9){
                x = n1[i];
                for(int j=0; j<n1.length; j++){
                    if(x == n1[j])
                    n1[j] = 9;
                }
                break;
            }
        }
        
        //minimum
        int y = 0;
        if (n2[0] != 1){
            y = n2[0];
            for(int i=0; i<n2.length; i++){
                if(y == n2[i])
                    n2[i] = 1;
            }
        }
        else {
            for(int i=1; i<n2.length; i++){
                if(n2[i] > 1){
                    y = n2[i];
                    for(int j=0; j<n2.length; j++){
                        if(y == n2[j])
                        n2[j] = 0;
                    }
                    break;
                }
            }
        }

        for(int i : n1) { 
            maximum *= 10; 
            maximum += i; 
        }
        
        for(int i : n2) { 
            minimum *= 10; 
            minimum += i; 
        }

        return maximum - minimum;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int num = Integer.parseInt(bufferedReader.readLine().trim());

        long result = Result.findRange(num);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
