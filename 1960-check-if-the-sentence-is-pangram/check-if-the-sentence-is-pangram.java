class Solution {
    public boolean checkIfPangram(String sentence) {
      HashMap<Character,Integer> map=new HashMap<>();
      for(char ch:sentence.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
      for(int i=97;i<=122;i++) if(!map.containsKey((char) i)) return false;
      return true;
    }
}