class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] returned = new int[2];
        for(int i = 0; i<nums.length-1; i++) {
            for(int j = i+1 ; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    returned[0] = i;
                    returned[1] = j;
                    return returned;
                } 
            }
        }
        return returned;
    }
}
