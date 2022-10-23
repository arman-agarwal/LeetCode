class Solution {
    public int[] findErrorNums(int[] nums) {
        int xor = 0;
        for(int i=0; i<nums.length; i++){
            xor^=(i+1)^(nums[i]);
        }
        System.out.println(xor);
        int bit = xor & ~(xor - 1);
        int x=0,y=0;
        for(int i=0; i<nums.length; i++){
            if((nums[i] & bit)!=0)
                x^=nums[i];
            else
                y^=nums[i];
            if(((i+1) & bit) !=0)
                x^=(i+1);
            else
                y^=(i+1);
        }
        
        for(int i:nums)
            if(x==i) return new int[]{x,y};
        
        return new int[]{y,x};
    }
}