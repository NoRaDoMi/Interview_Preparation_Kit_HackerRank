static long countTriplets(List<Long> arr, long r) {
	Map<Long,Long> rightMap = new HashMap<>();
	Map<Long,Long> leftMap = new HashMap<>();

//      frequenies of eles in arr
	for(Long l : arr){
		rightMap.put(l, rightMap.getOrDefault(l,0L)+1);
	}

	long res = 0;
	for(Long l : arr){
			long aj = l;
			long ai = l/r;
			long ak = l*r;

			long c1 = 0L, c2 = 0L;
			
			rightMap.put(aj,rightMap.get(aj)-1);

			if(leftMap.containsKey(ai)  && l % r ==0){
				c1 = leftMap.get(ai);
			}

			if(rightMap.containsKey(ak))
			{
				c2 = rightMap.get(ak);
			}

			res += c1*c2;
			
			leftMap.put(aj,leftMap.getOrDefault(aj,0L)+1);
	}

	return res;
}
