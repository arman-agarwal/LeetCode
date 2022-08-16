class Solution {
    public int countAsterisks(String s) {
        int c = 0;
        int flag = 1;
        int n = s.length();
        char temp;
        for(int i=0; i<n; i++){
            temp = s.charAt(i);
            if(temp=='|')
                flag*=-1;
            else if(flag==-1)
                continue;
            else if(temp =='*')
                c++;
        }
        return c;
    }
}