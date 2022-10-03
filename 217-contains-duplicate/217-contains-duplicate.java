class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<Integer>(nums.length);
        for (int i : nums) {
            if (map.contains(i))
                return true;
            map.add(i);
        }
        return false;
    }
}