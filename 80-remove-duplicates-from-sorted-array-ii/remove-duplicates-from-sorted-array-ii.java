class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int c1=1;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                if(count<2){
                    nums[c1]=nums[i];
                    c1++;
                }
                count++;
            }else{
                count=1;
                nums[c1]=nums[i];
                c1++;
            }
        }
        return c1;
    }
}