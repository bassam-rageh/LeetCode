class Solution {
    public int missingNumber(int[] nums) {
        int x = nums.length;
        for (int i = 0; i < nums.length; i++) {
            x ^= nums[i] ^ i;
        }
        return x;
    }
}