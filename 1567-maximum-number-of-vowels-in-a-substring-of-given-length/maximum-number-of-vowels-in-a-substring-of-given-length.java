class Solution {
    public int maxVowels(String s, int k) {
        int count=0,max=0;
        for(int i=0;i<k;i++) if(vowel(s.charAt(i))) count++;
        max=count;
        for(int i=k;i<s.length();i++){
            if(vowel(s.charAt(i))) count++;
            if(vowel(s.charAt(i-k))) count--;
            max=Math.max(count,max);
            if(max==k) return max;
        }
        return max;
    }
    public static boolean vowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return true;
        return false;
    }
}