class Solution {

    int[] arr;
    Random random;

    public Solution(int[] nums) {
        arr = nums;
        random = new Random();
    }

    public int[] reset() {
        return arr;
    }

    public int[] shuffle() {
        int[] shuffled = arr.clone();
        for (int i = 0; i < shuffled.length; i++) {
            int rand = random.nextInt(shuffled.length);
            int temp = shuffled[i];
            shuffled[i] = shuffled[rand];
            shuffled[rand] = temp;
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
