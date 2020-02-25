public String frequencySort(String s) {
    int[] a = new int[128];
    HashMap<Integer,List<Character>> map = new HashMap<>();
    StringBuilder sb = new StringBuilder();
	
    for(char c : s.toCharArray()){
		a[c]++;
	}

	for(int i = 0; i < 128; i++){
		if(a[i]!= 0){
			List<Character> list = map.getOrDefault(a[i], new ArrayList<>());
			list.add((char)i);
			map.put(a[i], list);
		}
	}

	TreeSet<Integer> tree = new TreeSet(map.keySet());
	tree = (TreeSet<Integer>)tree.descendingSet();

	for(Integer i : tree){
		List<Character> ls = map.get(i);

		for(Character c : ls){
			for(int j = 0; j < i; j++){
				sb.append(c);
			}
		}
	}
	return sb.toString();
    
}