import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    // Complete the isValid function below.
    static String isValid(String s) {
        Map<Character,Integer> counts = new HashMap<>();
        for(char c : s.toCharArray())
            counts.put(c,counts.getOrDefault(c,0)+1);
        
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i : counts.values())
            map.put(i,map.getOrDefault(i,0)+1);

        int k1 = 0,k2 = 0,v1 = 0,v2 = 0;
        if(map.size() == 1) return "YES";
        if(map.size() == 2 && map.containsValue(1)){
            for(Integer k: map.keySet())
            {
                Integer v = map.get(k);
                if(v == 1){
                    v1 = 1; 
                    k1 = k;
                }
                else{
                    v2 = v;
                    k2 = k;
                }
            }
            if((k1 - k2) == 1 || k1 == 1)
                    return "YES";
        
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}




