class Solution {
    public int removeDuplicates(int[] nums) {
        int pos = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                nums[pos] = nums[i];
                pos++;
                max = nums[i];
            }
        }
        return pos;
    }
}