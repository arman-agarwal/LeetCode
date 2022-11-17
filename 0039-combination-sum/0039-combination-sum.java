//pick nonpick
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backTracker(ans, 0, candidates, 0, new ArrayList<Integer>(), target);
        return ans;
    }
    
    private void backTracker(List<List<Integer>> list, int index, int[] cands, int sum, List<Integer> current, int target){
        if(sum==target){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.addAll(current);
            list.add(temp);
            return;
        }
        if(sum> target || index<0 || index>=cands.length)return;
        current.add(cands[index]);
        backTracker(list,index,cands,sum+cands[index],current,target);
        current.remove(current.size()-1);  
        backTracker(list,index+1,cands,sum,current,target);
    }
}