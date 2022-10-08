class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-2; i++){
            if(!(i==0 || nums[i]!=nums[i-1])) continue;
            int lo = i+1;
            int hi = nums.length-1;
            int sum = target-nums[i];
            while(lo<hi){
                int temp = sum-nums[lo]-nums[hi];
                if(Math.abs(temp)<Math.abs(target-closestSum))
                    closestSum = nums[i]+nums[lo]+nums[hi];
                if(temp<0)hi--;
                if(temp>0)lo++;
                if(temp==0)
                    return target;
                while(lo+1<nums.length-1 && nums[lo+1]==nums[lo]) lo++;
                while(hi-1>=0 && nums[hi-1]==nums[hi]) hi--;
            }
            
        }
        return closestSum;
    }
}