static String generateKey(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

// Complete the sherlockAndAnagrams function below.
static int sherlockAndAnagrams(String s) {
	Map<String,Integer> counts = new HashMap<>();
	
	// Duyet ra tat ca cac substring cua 1 string
	for(int i = 0; i< s.length(); i++ ){
		for(int j = i+1; j<= s.length(); j++){
			String key = generateKey(s.substring(i,j));
		
			counts.put(key,counts.getOrDefault(key,0)+1);
		}
	}

	int res = 0;
	for(String i : counts.keySet()){
		int v = counts.get(i);
		res += (v*(v-1)/2);
	}
	return res;
}

/*
	Ý tưởng: Duyệt qua tất cả các substring của String s
	(*) 1 String s có độ dài n sẽ có n*(n-1)/2 - 1 substring.
	Với mỗi substring sẽ tạo ra 1 key bằng substr đó. (Sắp xếp lại theo thứ tự từ điển. Vd: om và mo sẽ sinh ra 1 key là mo)
	Với mỗi key ta nhận được 1 value v -> Số pair anagram từ key đó sẽ là v*(v-1)/2 (Chọn 2 từ v)
	Kết quả sẽ là tổng các pair anagram của các key.
	
	Time-Complexity: O(?)
*/