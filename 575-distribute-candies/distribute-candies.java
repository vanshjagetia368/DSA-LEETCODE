class Solution {
    public int distributeCandies(int[] candyType) {
        // HashMap<Integer,Integer> map1=new HashMap<>();
        // for(int i:candyType) map1.put(i,map1.getOrDefault(i,0)+1);
        // HashMap<Integer,Integer> map2=new HashMap<>();
        // for(int i:map1.keySet()){
        //     int a=map1.get(i);
        //     map2.put(a,map2.getOrDefault(a,0)+1);
        // }
        // int max=Integer.MIN_VALUE;
        // for(int i:map2.keySet()) max=Math.max(max,map2.get(i));
        // return max;
        HashSet<Integer> set=new HashSet<>();
        for(int i:candyType) set.add(i);
        int max=candyType.length/2;
        return Math.min(set.size(),max);
     }
}