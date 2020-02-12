public int binaryGap(int N) {
    int result = 0;
    int diff = 0;
    
    for(int i = 0; i < 32; i++){
        if((N & (1 << i)) != 0){
            result = Math.max(diff, result);
            diff = 1;
        }
        else if(diff != 0){
            diff += 1;
        }
        
    }
    return result;
    
}