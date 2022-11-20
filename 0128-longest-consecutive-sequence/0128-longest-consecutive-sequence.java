//create hashset from nums. Iterate. Try building seqs from numbers whose predecessors are not present
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        int lStreak = 0;
        int cStreak = 0;
        for(int i:nums)s.add(i);
        for(int n:s){
            if(!s.contains(n-1)){
                cStreak = 1;
                int cNum = n;
                while(s.contains(cNum+1)){
                    cNum++;
                    cStreak++;
                }
                lStreak = Math.max(cStreak,lStreak);
            }
        }
        return lStreak;
    }
}