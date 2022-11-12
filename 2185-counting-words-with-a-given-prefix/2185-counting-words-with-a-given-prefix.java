class Solution {
    public int prefixCount(String[] words, String pref) {
    int c=0;
    int n = pref.length();
      for(String s:words)
         c+=(s.length()>=n)?(s.substring(0,n).equals(pref))?1:0:0;
        return c;
    }
}