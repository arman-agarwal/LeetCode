class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int index = 0;
        for(int i=0; i<n; i++){
            if(nums[i]!=val){
                nums[index] = nums[i];
                index++;
            }
        }
        
    return index;
    }
    
    // private void swap(int a, int b, int[] nums){
    //     int temp = nums[a];
    //     nums[a] = nums[b];
    //     nums[b] = temp;
    //}
}