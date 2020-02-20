public int distributeCandies(int[] candies) {
    Set<Integer> set = new HashSet<>();
    int counter = 0;
    for(int i = 0; i < candies.length; i++){
        set.add(candies[i]);
    }
    if(set.size() <= candies.length/2){
        return set.size();
    }
    
    return candies.length/2;
    
}