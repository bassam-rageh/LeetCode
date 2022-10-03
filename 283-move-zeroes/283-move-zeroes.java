class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;
        int temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
                pos++;
            }
        }
    }
}