class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int n = cardPoints.length;

        int total = 0;
        for(int c : cardPoints) total += c;

        int windowSize = n - k;
        int windowSum = 0;
        for(int i = 0; i < windowSize; i++) windowSum += cardPoints[i];

        int minWindow = windowSum;
        for(int r = windowSize; r < n; r++){
            windowSum += cardPoints[r];
            windowSum -= cardPoints[r - windowSize];

            minWindow = Math.min(minWindow, windowSum);
        }

        return total - minWindow;
    }
}