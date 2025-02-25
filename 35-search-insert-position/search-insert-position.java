class Solution {
    public int searchInsert(int[] nums, int target) {
        int j=nums.length-1;
        for(int i=0;i<nums.length;i++,j--){
            if(nums[i]==target){
                return i;
                
            }else if(target<nums[i]){
                return i;
               
            }else if(target>nums[j]){
                return j+1;
               
            }
        }
       return 0; 
    }
}