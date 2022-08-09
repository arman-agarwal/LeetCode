class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
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
            if(i!=index && candidates[i]==candidates[i-1])
                continue;
            sum+=candidates[i];
            list.add(candidates[i]);
            helper(target,sum,list,ans,i+1,candidates);
            
            sum-=candidates[i];
            list.remove(list.size()-1);
        }
    }
}