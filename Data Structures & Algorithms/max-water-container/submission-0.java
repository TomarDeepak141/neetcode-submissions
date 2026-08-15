class Solution {
    public int maxArea(int[] heights) {
        int r=heights.length-1;
        int l=0;
        int ans=0;
        while(l<r){
            int sum=(r-l)*(Math.min(heights[l],heights[r]));
            ans=Math.max(ans,sum);
            if(heights[l]<heights[r])l++;
            else r--;
        }
        return ans;
    }
}
