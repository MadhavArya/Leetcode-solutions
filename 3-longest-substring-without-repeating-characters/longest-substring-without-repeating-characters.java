import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0, high = 0;
        int maxLen = 0;
        HashSet<Character> set = new HashSet<>();

        while (high < s.length()) {
            char ch = s.charAt(high);

            if (!set.contains(ch)) {
                set.add(ch);
                maxLen = Math.max(maxLen, high - low + 1);
                high++;
            } else {
                set.remove(s.charAt(low));
                low++;
            }
        }
        return maxLen;
    }
}
