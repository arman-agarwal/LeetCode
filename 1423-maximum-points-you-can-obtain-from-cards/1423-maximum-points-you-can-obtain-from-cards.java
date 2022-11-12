class Solution {
    public int maxScore(int[] cardPoints, int k) {
        //using sliding window to remove window of length n-k with minimum sum
        int minSum = Integer.MAX_VALUE;
        int totalSum = 0;
        int currentSum = 0;
        int windowLength = cardPoints.length-k;
        for(int i=0; i<windowLength; i++){
            currentSum+=cardPoints[i];
            totalSum+=cardPoints[i];
        }
        for(int i=windowLength; i<cardPoints.length; i++){
            totalSum+=cardPoints[i];
            minSum = Math.min(minSum, currentSum);
            currentSum+=cardPoints[i];
            currentSum-=cardPoints[i-windowLength];
        }
        minSum = Math.min(minSum, currentSum);
        return totalSum-minSum;
    }
}