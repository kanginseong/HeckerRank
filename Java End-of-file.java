import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        
        String line;
        
        int i = 1;
        
        while(std.hasNext()){ // hasNext() => boolean type
            line = std.nextLine(); // Output one line
            System.out.println(i + " " + line);
            i++;
        } // Until 'std' is empty
    }
}
