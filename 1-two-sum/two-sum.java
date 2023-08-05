class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i<nums.length; i++){
            Integer x = map.get(target-nums[i]);
            if(x != null){
                int[] sol = {i,x};
                return sol;
            }
            map.put(nums[i], i);
        }
        return null;
    }
}