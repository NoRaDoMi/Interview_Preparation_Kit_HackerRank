import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s1.toCharArray()){
            // map.put(c,map.getOrDefault(c,0)+1);
            if(!map.containsKey(c))
                map.put(c,1);
        }

        for(char c:s2.toCharArray()){
            if(map.containsKey(c))
                return "YES";
        }
        return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

/* Cách 2: Dùng Set, tập chứa <= 26 (kí tự) -> dùng retainAll
static String twoStrings(String s1, String s2) {
        Set<Character> s1_set = new HashSet<>();
		Set<Character> s2_set = new HashSet<>();
		
		for(char c : s1.toCharArray())
			s1_set.add(c);

		for(char c : s2.toCharArray())
			s1=2_set.add(c);
		
		s1_set.retainAll(s2_set);
		if(s1_set.isEmpty())
			return "NO"
		return "YES";
	}

*/