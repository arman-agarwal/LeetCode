class Solution {
    public boolean isPalindrome(String s) {
        int R = s.length()-1;
        int L = 0;
        do{
            if(!Character.isLetterOrDigit(s.charAt(L))){L++;continue;}
            if(!Character.isLetterOrDigit(s.charAt(R))){R--;continue;} if(Character.toLowerCase(s.charAt(L))!=Character.toLowerCase(s.charAt(R)))return false;
            L++;R--;
        }while(L<R);
        return true;
    }
}