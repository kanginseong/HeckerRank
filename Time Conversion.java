import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
    
        String time[] = s.split(":");
        String hours = time[0];
        String minutes = time[1];
        String seconds = time[2].substring(0, 2);
        String type = time[2].substring(2);
        String changeT = "";
        
        if(type.equals("PM")) {
            if(hours.equals("12"))
                hours = "00";
            int H = Integer.parseInt(hours) + 12;
            hours = H + ""; 
            changeT = hours + ":" + minutes + ":" + seconds;
        }
        else if(type.equals("AM")){
            if(hours.equals("12"))
                hours = "00";
            changeT = hours + ":" + minutes + ":" + seconds;
        }

        return changeT;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
