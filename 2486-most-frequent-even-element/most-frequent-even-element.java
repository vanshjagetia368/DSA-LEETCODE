class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        int ans=-1,max=0;
        for(int i:map.keySet()){
            if(i%2==0){
                int freq=map.get(i);
                if(freq>max||(freq==max&&i<ans)){
                    max=freq;
                    ans=i;
                }
            }
        }
        return ans;
    }
}