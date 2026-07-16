class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int amount = -1;
        while(i<j) {
            int height = Math.min(heights[i],heights[j]);
            int candidate = (j-i) * height;
            if(amount < candidate) 
                amount = candidate;
            if(heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return amount;
    }
}
