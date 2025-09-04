class Solution {
    public int removeElement(int[] nums, int val) {
        int k =nums.length;
        int i=0;
        while(i<k){
            if(nums[i]==val){
                nums[i]=nums[k-1];
                k--;
            }else{
                i++;
            }
        }




        return k;
    }
}