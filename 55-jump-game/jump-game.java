class Solution {
    public boolean canJump(int[] nums) {
        int finalpos=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=finalpos){
                finalpos=i;
            }
        }
        return finalpos==0;
    }
}