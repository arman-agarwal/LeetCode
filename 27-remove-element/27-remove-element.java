class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int index = n-1;
        for(int i=0; i<=index; i++){
            if(nums[i]==val){
                swap(index,i,nums);
                index--;
                i--;
            }
        }
        
    return index+1;
    }
    
    private void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}