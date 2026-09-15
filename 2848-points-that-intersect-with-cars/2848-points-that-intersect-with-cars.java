class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        //via hashset 
        // HashSet<Integer> set=new HashSet<>();
        // for(int i=0;i<nums.size();i++){
        //     for(int j=0;j<nums.get(i).size();j++){
        //         set.add(nums.get(i).get(j));
        //     }
        // }
        // int min=Collections.min(set);
        // int max=Collections.max(set);
        // for(int i=min;i<=max;i++){
        //     if(!set.contains(i)) set.add(i);
        // }
        // return set.size();
        //approach via boolean array tc=O(n*100)=O(n)
        boolean[] arr=new boolean[101];
        for(int i=0;i<nums.size();i++){
            int start=nums.get(i).get(0),end=nums.get(i).get(1);
            for(int j=start;j<=end;j++){
                arr[j]=true;
            }
        }
        int c=0;
        for(int i=0;i<arr.length;i++) if(arr[i]==true) c++;
        return c;
        //approach via hashset O(n*k)
        // HashSet<Integer> set=new HashSet<>();
        //  for(int i=0;i<nums.size();i++){
        //     int start=nums.get(i).get(0),end=nums.get(i).get(1);
        //     for(int j=start;j<=end;j++){
        //         set.add(j);
        //     }
        // }
        // return set.size();
    }
}