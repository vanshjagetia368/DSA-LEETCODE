class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n-reverse(n));
    }
    private static int reverse(int n){
        int num=0;
        while(n>0){
            int digit=n%10;
            num=num*10+digit;
            n/=10;
        }
        return num;
    }
}