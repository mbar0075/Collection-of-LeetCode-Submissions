class Solution {
    public int myAtoi(String s) {
        int ret = 0;
        boolean positive = true;
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            positive = s.charAt(i) == '+';
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (ret > (Integer.MAX_VALUE - digit) / 10) {
                return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ret = ret * 10 + digit;
            i++;
        }
        return positive ? ret : -ret;
    }
}
