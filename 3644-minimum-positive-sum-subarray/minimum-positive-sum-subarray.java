class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum = Integer.MAX_VALUE;
        int n = nums.size();

        for (int windowSize = l; windowSize <= r; windowSize++) {
            if (windowSize > n) break;

            int sum = 0;
         
            for (int i = 0; i < windowSize; i++) {
                sum += nums.get(i);
            }
            if (sum > 0) minSum = Math.min(minSum, sum);

            for (int i = windowSize; i < n; i++) {
                sum += nums.get(i) - nums.get(i - windowSize);
                if (sum > 0) minSum = Math.min(minSum, sum);
            }
        }

        return (minSum == Integer.MAX_VALUE) ? -1 : minSum;
    }
}
