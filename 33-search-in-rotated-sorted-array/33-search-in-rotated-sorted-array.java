class Solution {
    public int search(int[] nums, int target) {
        int start = nums[0];
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int mid = (low+high)/2;
        while(low<=high){
            mid = (low+high)/2;
            if(nums[mid]<start)
                high = mid-1;
            else
                low = mid+1;
        }
        
        if(target>=start)
            return binarySearch(0,mid,target,nums);
        else
            return binarySearch(mid,n-1,target,nums);
    }   
    private int binarySearch(int start, int end, int target, int[] nums){
        int mid; 
        while(start<=end){
            mid = (start+end)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target)
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}