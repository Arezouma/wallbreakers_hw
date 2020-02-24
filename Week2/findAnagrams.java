public List<Integer> findAnagrams(String s, String p) {
    List<Integer> list = new ArrayList<>();
    if(p.length() > s.length() || s.length()==0) {
        return list;
    }
	int[] first = new int[26];
	int[] second = new int[26];
	int n = p.length();

	for(char c : p.toCharArray()){
		first[c-'a']++;
	}

	for(int i = 0; i < n - 1; i++){
		second[s.charAt(i)-'a']++;
	}

	for(int i = n - 1; i < s.length(); i++){
		second[s.charAt(i)-'a']++;
		if(Arrays.equals(first, second)){
			list.add(i - n + 1);
		}
		second[s.charAt(i - n + 1)-'a']--;
	}
    return list;
    
}