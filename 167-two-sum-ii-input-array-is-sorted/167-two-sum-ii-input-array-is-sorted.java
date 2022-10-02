public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] sol = new int[2];
        int left = 0, right = numbers.length - 1, currentSum;
        while (left <= right) {
            currentSum = numbers[left] + numbers[right];
            if (currentSum == target) {
                sol[0] = left + 1;
                sol[1] = right + 1;
                return sol;
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return sol;
    }

}
