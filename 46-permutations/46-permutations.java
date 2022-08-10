class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        helper(ans, nums, 0, nums.length);
        return ans;
    }
    
    private void helper(ArrayList<List<Integer>> ans, int[] nums, int a, int n){
        if(a>=n-1){
            ArrayList<Integer> l = new ArrayList<>();
            for(int t: nums)
                l.add(t);
            ans.add(l);
            return;
        }
        for(int i = a; i<n; i++){
            swap(nums,i,a);
            helper(ans,nums,a+1,n);
            swap(nums,i,a);
        }
    }
    
    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}