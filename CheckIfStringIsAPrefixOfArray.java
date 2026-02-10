class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String temp="";
        for(String word:words){
            temp+=word;
            if(temp.equals(s)) return true;
        }
        return false;
    }
}
