public int[] plusOne(int[] digits) {
        
    for(int i = digits.length - 1; i >= 0; i--){
        if(digits[i] == 9) {
            digits[i] = 0;
        }
        else {
            digits[i] += 1;
            return digits;
        }
    }
if(digits[0] == 0){
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
return new int[0];
}