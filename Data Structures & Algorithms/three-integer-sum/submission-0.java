class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>(nums.length);
        for(int i = 0 ; i < nums.length ; i++)
            numsMap.put(nums[i], i);
        Set<List<Integer>> tripletsSet = new HashSet<>();
        List<List<Integer>> triplets = new ArrayList<>();
        
        for(int i = 0 ; i < nums.length ; i++) {
            for(int j = i + 1 ; j < nums.length ; j++) {
                int paraZero = 0 - nums[i] - nums[j];
        
                if(numsMap.containsKey(paraZero)) {
                    int index = numsMap.get(paraZero);
                    if(index != i && index != j) {
                        int[] triplos = {nums[i],nums[j],paraZero};
                        Arrays.sort(triplos);
                        tripletsSet.add(Arrays.asList(triplos[0], triplos[1], triplos[2]));
                    }
                }
            }
        }
        triplets = new ArrayList<>(tripletsSet);
        return triplets;
    }
}
