class Solution {
    public String getPermutation(int n, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        long fact = 1;
        for(int i=1; i<=n; i++){
            fact*=i;
            list.add(i);
        }
        return helper(n,list,k,(int)fact/n);
    }
    
    private String helper(int n, ArrayList<Integer> list, int k, int setLength){
        
        if(list.size()==1)
            return Integer.toString(list.remove(0));
        String temp = Integer.toString(list.remove(((k-1)/setLength)%list.size()));
        return temp+helper(--n,list,k,setLength/n);
    }
}