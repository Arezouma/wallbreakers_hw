public int titleToNumber(String s) {
    int ans = 0;
    int exp = 1;
    for (int i = s.length()-1; i >= 0; i--) {
        if (i == s.length()-1) {
            ans += s.charAt(i) - 'A' + 1;
        } else {
            ans += Math.pow(26, exp)*(s.charAt(i) - 'A' + 1);
            exp++;
        }
    }
    return ans;
        
}