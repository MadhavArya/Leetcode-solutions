class Solution {
    public int jump(int[] nums) {
       int totaljump=0;
       int d=nums.length-1;
       int cover=0,lastjump=0;
       if(nums.length==1)
        return 0;
       for(int i=0;i<nums.length;i++){
        cover=Math.max(cover,i+nums[i]);
        if(i==lastjump){
            lastjump=cover;
            totaljump++;
            if(cover>=d){
                return totaljump;
            }
        }
       } 
       return totaljump;
    }
}