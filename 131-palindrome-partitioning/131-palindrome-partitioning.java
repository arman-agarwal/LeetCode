class Solution {
    public List<List<String>> partition(String s) {
        ArrayList<List<String>> ans = new ArrayList<List<String>>();
        backTracker(ans, new ArrayList<String>(), s, 0);
        return ans;
    }
    
    private void backTracker(ArrayList<List<String>> ans, ArrayList<String> list, String s, int index){
        if(index>=s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index; i<s.length(); i++){
            if(isPalindrome(s,index,i)){
                list.add(s.substring(index,i+1));
                backTracker(ans, list,s,i+1);
                list.remove(list.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s, int low,int high){
        while(low<high){
            if(s.charAt(low)!=s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }     
}