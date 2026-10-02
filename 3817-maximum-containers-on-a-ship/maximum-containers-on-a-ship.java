class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        long maxSlots=(long) n*n;
        long a=maxWeight/w;
        return (int) Math.min(a,maxSlots);
    }
}