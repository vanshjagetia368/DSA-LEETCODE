class Solution {
    public boolean validDigit(int n, int x) {
        String s=String.valueOf(n);
        char c=(char) ('0'+x);
        return s.charAt(0)!=c && s.indexOf(c)!=-1;
    }
}