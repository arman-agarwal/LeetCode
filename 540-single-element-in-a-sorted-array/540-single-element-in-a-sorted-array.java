class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int low = 1;
        int high = nums.length-1;
        int mid = (low+high)/2;
        while(low<=high){
            System.out.println(low+" "+high+" "+mid);
            if((mid & 1)==0){
                if(nums[mid]==nums[mid-1])
                    high=mid-1;
                else
                    low=mid+1;
            }
            else{
                if(nums[mid]==nums[mid-1])
                    low=mid+1;
                else
                    high=mid-1;
            }
            mid=(low+high)/2;
        }
        return nums[high];
    }
}