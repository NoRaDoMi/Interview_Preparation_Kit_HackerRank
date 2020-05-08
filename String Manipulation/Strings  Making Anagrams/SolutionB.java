// Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        // Co toi da 26 ki tu
        int[] a_frequencies = new int[26];
        int[] b_frequencies = new int[26];

        for(char c : a.toCharArray()){
            int position = (int)c - (int)'a';
            a_frequencies[position]++;
        }

        for(char c : b.toCharArray()){
            int position = (int)c - (int)'a';
            b_frequencies[position]++;
        }

        int res = 0;
        for(int i = 0;i < 26;i++){
            int diffCount = Math.abs(a_frequencies[i] - b_frequencies[i]);
            res += diffCount;
        }
        return res;
    }