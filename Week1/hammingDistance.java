public int hammingDistance(int x, int y) {
        
    int bits = 0;
    if(x == y) 
        return bits;
    for(int i = 0; i < 32; i++){
        bits += ( (x & 1) == (y & 1)) ? 0 : 1;   
        x = x >> 1;  
        y = y >> 1;
    }
    
    return bits;
        
}