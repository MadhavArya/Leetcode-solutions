class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        int min=Integer.MAX_VALUE;
        while(l<r){
            min=Math.min(height[r],height[l]);
            max=Math.max(max,(min*(r-l)));
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}