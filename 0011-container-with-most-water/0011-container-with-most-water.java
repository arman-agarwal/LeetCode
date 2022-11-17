class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while(i<j){
            int area = (j-i)*(height[j]);
            if(height[i]<height[j]){area = (j-i)*(height[i]);i++;}
            else j--;
            max = Math.max(max, area);
                        
        }
        return max;
    }
}