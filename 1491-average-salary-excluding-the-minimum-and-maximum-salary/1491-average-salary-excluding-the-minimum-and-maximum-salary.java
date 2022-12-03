class Solution {
    public double average(int[] salary) {
        if(salary.length<3)throw new Error("invalid data");
        int min = salary[0];
        int max = salary[0];
        long sum = 0;
        for(int i:salary){
            sum+=i;
            min = Math.min(min,i);
            max = Math.max(max,i);
        }
        return ((double)(sum-min-max))/(salary.length-2);
    }
}