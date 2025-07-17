class Solution {
    public int trap(int[] height) {
       int n=height.length;
       int lMax=0;
       int rMax=0;
       int l=0;
       int r=n-1;
       int result=0;
       while(l<r){
        if(lMax < height[l]){
          lMax=Math.max(height[l],lMax);
        }
        if(rMax < height[r]){
            rMax=Math.max(height[r],rMax);
        }
        if(lMax<rMax){
            result=result+lMax-height[l];
            l++;
        }
        else{
            result+=rMax-height[r];
            r--;
        }
       }
       return result;
    }
}