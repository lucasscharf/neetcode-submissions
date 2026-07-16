class Solution {
    public int trap(int[] heights) {
        
        int left=0;
        int right=heights.length-1;
        int maxLeft = heights[left];
        int maxRight = heights[right];
        int total = 0;
        while(left < right) {
            int height = Math.min(maxLeft, maxRight);
            int atual;
            if(maxLeft < maxRight) {
                atual = height - heights[left];
                left++;
                if(heights[left] > maxLeft)
                    maxLeft = heights[left];
            } else {
                atual = height - heights[right];
                right--;
                if(heights[right] > maxRight)
                    maxRight = heights[right];
            }
            if(atual>0) {
                total+=atual;
            }
        }

        return total;
    }
}
