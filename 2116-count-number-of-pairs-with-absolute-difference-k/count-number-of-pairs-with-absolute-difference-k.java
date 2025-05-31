class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int num:nums){
            if(map.containsKey(num-k)){
                count+=map.get(num-k);
           }
           if(map.containsKey(num+k)){
            count+=map.get(num+k);
           }
           map.put(num,map.getOrDefault(num,0)+1);
        }
        
        return count;
    }
}