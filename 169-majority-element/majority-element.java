class Solution {
    public int majorityElement(int[] nums) {
        int mjr=nums[0];
        int votes=1;
        for(int i =1;i<nums.length;i++){
           if(votes==0){
            mjr=nums[i];
            votes++;
           }else if(mjr==nums[i]){
            votes++;
           }else{
            votes--;
           }
        }
        return mjr;
    }       
}