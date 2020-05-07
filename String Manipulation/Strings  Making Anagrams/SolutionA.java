// Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        Map<Character,Integer> counts = new HashMap<>();
        for(char c:a.toCharArray())
        {
            counts.put(c,counts.getOrDefault(c,0)+1);
        }

        int commonCounts = 0;

        for(char c:b.toCharArray()){
            if(counts.containsKey(c) && counts.get(c) > 0){
                counts.put(c,counts.get(c) - 1);
                commonCounts++;
            }
                
        }

        return a.length() + b.length() - commonCounts*2;
    }
	
	Time-complexity: O(n+m), n,m la do dai a va b