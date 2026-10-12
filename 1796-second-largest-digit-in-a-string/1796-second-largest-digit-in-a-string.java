class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> set=new HashSet<>();
        int high=-1,secHigh=-1;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){

            int digit=s.charAt(i)-'0';
            if(set.add(digit)){
                if(digit>high){
                    secHigh=high;
                    high=digit;
                }
                else if(digit>secHigh) secHigh=digit;
            }
            }

        }
        return secHigh;
    }
}