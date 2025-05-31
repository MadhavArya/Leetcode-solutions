import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return result;
        }

        int n = nums.length;
        int i = 0; 

        while (i < n) {
            int start = nums[i]; 
            int j = i; 
         
            while (j + 1 < n && nums[j + 1] == nums[j] + 1) {
                j++;
            }

            int end = nums[j]; 

            
            if (start == end) {
               
                result.add(String.valueOf(start));
            } else {
    
                result.add(start + "->" + end);
            }
            i = j + 1;
        }

        return result;
    }
}