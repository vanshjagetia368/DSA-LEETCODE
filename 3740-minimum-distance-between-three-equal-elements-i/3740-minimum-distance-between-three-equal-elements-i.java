class Solution {
    private int min=Integer.MAX_VALUE;
    public int minimumDistance(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        for(int i:map.keySet()) if(map.get(i)>=3) helper(i,nums);
        return min==Integer.MAX_VALUE?-1:min;
    }
    public void helper(int a,int[] nums){
        ArrayList<Integer> idx=new ArrayList<>();
        for(int i=0;i<nums.length;i++) if(nums[i]==a) idx.add(i);
        for(int i=0;i<=idx.size()-3;i++){
            int f=idx.get(i);
            int t=idx.get(i+2);
            int dis=2*(t-f);
            if(dis<min) min=dis;
        }
    }
}