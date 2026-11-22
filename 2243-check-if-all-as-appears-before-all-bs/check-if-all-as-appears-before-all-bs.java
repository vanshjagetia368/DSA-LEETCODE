class Solution {
    public boolean checkString(String s) {
        int la=s.lastIndexOf('a');
        int fb=s.indexOf('b');
        if(la==-1||fb==-1) return true;
        return la<fb;
    }
}