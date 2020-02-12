public int findComplement(int num) {
    int base = 1, result = 0;
    while(num != 0) {
        if(num % 2 == 0) 
            result += base;
        base = base << 1;
        num = num >> 1;
    }
    return result;
        
}