class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        helper(target,0,new ArrayList<Integer>(), ans, 0, candidates);
        return ans;
    }
    
    private void helper(int target, int sum, List<Integer> list, ArrayList<List<Integer>> ans,int index,int[] candidates){
        if(sum>target)
            return;
        if(sum==target){
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        if(index>=candidates.length)
            return;
        for(int i=index; i< candidates.length;i++){
            sum+=candidates[i];
            list.add(candidates[i]);
            helper(target,sum,list,ans,i,candidates);
            
            sum-=candidates[i];
            list.remove(list.size()-1);
        }
    }
}