class Solution {
    public boolean isValid(String s) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            int parsed = parser(s.charAt(i));
            if(parsed<0){
                if(st.size()<=0 || st.pop()+parsed!=0)return false;
            }
            else
                st.push(parsed);
        }
    if(st.size()!=0)return false;
        return true;
    }
    
    private int parser(char ch){
        int ans=-100 ;
        switch(ch){
            case '(' : ans=1;break;
            case '{' : ans=2;break;
            case '[' : ans=3;break;
            case ')' : ans=-1;break;
            case '}' : ans=-2;break;
            case ']' : ans=-3;break;
        }
        return ans;
    }
}