//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
  
    public static void main(String []argh){
        
        Map<String, Integer> info = new HashMap<String, Integer>();
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
          
            info.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            
            if(info.get(s)==null) 
                System.out.println("Not found");
            else
                System.out.println(s + "=" + info.get(s));
        }
        in.close();
    }
}
