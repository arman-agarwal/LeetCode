class Solution {
    public static int longestSubarray(int[] nums) {
        int max = 0;
        int cSum = 0;
        boolean allowance = true;
        int leftEdge = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0 ){
                if(!allowance){
                    max = Math.max(max, cSum);
                    while(!allowance){
                        cSum--;
                        allowance = (nums[leftEdge]==0)?true:false;
                        leftEdge++;
                    }
                }
                allowance=false;
                
            }
            cSum++;
        }
        max = Math.max(max, cSum);
        return (max==0)?0:(max-1);
    }
}