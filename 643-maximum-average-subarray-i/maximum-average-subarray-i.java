class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        double max = sum;
        
        for (int i = 1; i < nums.length-k+1; i++) {
            sum += nums[i-1+k] - nums[i - 1]; 
            if (sum > max) {
                max = sum;
            }
        }
        
        return max / k;
    }
}
