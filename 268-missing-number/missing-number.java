class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(correct<nums.length&&nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j){
                return j;
            }
        }
        return i;
    }
}