class Solution {
    public int arraySign(int[] nums) {
        // int prod=1;
        // for(int i:nums) prod*=i;
        // if(prod>0) return 1;
        // else if(prod<0) return -1;
        // return 0;
        int sig=1;
        for(int i:nums){
            if(i==0) return 0;
            if(i<0) sig=-sig;
        }
        return sig;
    }
}