class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int start=0;
        int end=heights.length-1;
        while(start<end){
            int curMin=Math.min(heights[start],heights[end]);

            max= Math.max(max,curMin * (end-start));

            if(curMin==heights[start]){
                start++;
            }else
                end--;


        }
        return max;
    }
}
