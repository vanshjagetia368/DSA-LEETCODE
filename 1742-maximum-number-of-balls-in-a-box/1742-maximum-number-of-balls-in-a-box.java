class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=lowLimit;i<=highLimit;i++){
        int sum1=sum(i);
        map.put(sum1,map.getOrDefault(sum1,0)+1);
    }
    int max=Integer.MIN_VALUE;
    for(int i:map.keySet()){
        max=Math.max(max,map.get(i));
    }
    return max;
        
    }
    public static int sum(int n){
        int ans=0;
        while(n>0){
            int digit=n%10;
            ans+=digit;
            n/=10;
        }
        return ans;
    }
}