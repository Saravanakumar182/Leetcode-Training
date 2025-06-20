class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String res=s+s;
        String mod=res.substring(1,res.length()-1);
        if(mod.contains(s))
            return true;
        return false;
    }
}