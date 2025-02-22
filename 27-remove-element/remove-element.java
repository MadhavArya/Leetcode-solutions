class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0,c=0;
        while(k<nums.length){
            if(nums[k]==val){
                k++;
            } else{
                nums[c]=nums[k];
                k++;
                c++;
            }
        }
        return c;
    }
}