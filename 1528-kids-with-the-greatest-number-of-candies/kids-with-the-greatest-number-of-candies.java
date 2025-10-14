import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        // Find the maximum number of candies
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        // Check for each kid
        for (int candy : candies) {
            list.add(candy + extraCandies >= max);
        }

        return list;
    }
}
