class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.Set<Integer> elements = new java.util.HashSet<Integer>();
        for (int i = 0 ; i < nums.length ; i ++) {
            if(elements.contains(nums[i]))
                return true;
            elements.add(nums[i]);
        }
        return false;
    }
}