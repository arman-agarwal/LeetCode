class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backTracker(new ArrayList<Integer>(), ans, nums, nums.length, 0);
        return ans;
    }
    
    private void backTracker(ArrayList<Integer> list, ArrayList<List<Integer>> ans, int[] nums, int n, int index){
        ans.add(new ArrayList<>(list));
        if(index>=n)
            return;
        
        for(int i=index; i<n; i++){
            if(i!=index && nums[i]==nums[i-1])
                continue;
            list.add(nums[i]);
            backTracker(list,ans,nums,n,i+1);
            list.remove(list.size()-1);
        }
    }
}