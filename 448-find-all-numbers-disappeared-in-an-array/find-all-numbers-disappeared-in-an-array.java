class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1){
                arr.add(j+1);
            }
        }
        return  arr;
    }
}