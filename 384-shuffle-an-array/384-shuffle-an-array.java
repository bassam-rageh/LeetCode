class Solution {

    int[] arr;
    int[] shuffled;

    public Solution(int[] nums) {
        arr = nums;
        shuffled = nums.clone();
    }

    public int[] reset() {
        for (int i = 0; i < shuffled.length; i++) {
            shuffled[i] = arr[i];
        }
        return shuffled;
    }

    public int[] shuffle() {
        for (int i = 0; i < shuffled.length; i++) {
            int random = new Random().nextInt(shuffled.length);
            int temp = shuffled[i];
            shuffled[i] = shuffled[random];
            shuffled[random] = temp;
        }
        return shuffled;
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
