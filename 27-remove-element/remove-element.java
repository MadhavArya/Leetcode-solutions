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
        for(int j=0;j<nums.length;j++){
            System.out.print(nums[j]+" ");
        }
        System.out.println();
        return k;
    }
}