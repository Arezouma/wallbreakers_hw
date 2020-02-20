public boolean isHappy(int n) {
    boolean happy = false;
    int sum = 0;
    if (n == 1) 
        return true;
    if (n == 7) 
        return true;
    
    if (n < 10) 
        return false;
    sum = 0;
    while (n != 0){
        int num = n % 10;
        sum += num * num;
        n = n/10;
    }
    return isHappy(sum);
}