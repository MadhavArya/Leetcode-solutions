class Solution {
    public int[] findErrorNums(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[correct]!=nums[i]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        int arr []=new int [2];
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                arr[0]=nums[j];
                arr[1]=j+1;
            }
        }
        return arr;
    }
}