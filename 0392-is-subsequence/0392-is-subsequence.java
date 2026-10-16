class Solution {
    public boolean isSubsequence(String s, String t) {
        int raj=0;
        int bhuvana=0;
        while(raj<s.length() && bhuvana<t.length()){
            if(s.charAt(raj) == t.charAt(bhuvana))
            {
                raj++;
            }
            bhuvana++;
        }
        return raj==s.length();
    }
}