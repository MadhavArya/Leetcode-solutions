class Solution {
    public int splitArray(int[] nums, int k) {
        int s=0,e=0;
        for(int i=0;i<nums.length;i++){
            s=Math.max(s,nums[i]);
            e+=nums[i];
        }
        while(s<e){
            int sum=0;
            int mid=s+((e-s)/2);
            int pieces=1;
            for(int num:nums){
                if(sum+num>mid){
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }
            if(pieces>k){
                s=mid+1;
            }else{
                e=mid;
            }
        }
        return e;
    }
}