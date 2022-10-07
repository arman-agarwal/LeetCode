class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0;
        int h = nums.length-1;
        int m = (l+h)/2;
        while(l<=h){
            m = (l+h)/2;
            if(m-1 >=0 && nums[m-1]==nums[m]){
                if(m%2==0)
                h = m-1;
                else
                l = m+1;
            }
            else if(m+1<nums.length && nums[m+1]==nums[m]){
                if(m%2==0)
                l = m+1;
                else
                h = m-1;
            }
            else
                return nums[m];
        }
        return 0;
    }
}