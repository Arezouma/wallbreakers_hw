public List<Integer> selfDividingNumbers(int left, int right) {
        
    List<Integer> list = new ArrayList<>();
    int count = 0;
    for(int i = left; i <= right; i++){
        if(i / 10 == 0){
            list.add(i);
            continue;
        }
        int flag = i;
        count = 0;
        while(flag > 0) {
            int n = flag % 10;
            if(n == 0){
                count++;
            }
            
            if(n != 0 && (i % n) != 0)
                count++;
            flag /= 10;
        }
        if(count == 0)
            list.add(i);
    }
    return list;
    
}