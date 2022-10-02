class Solution {
    public int[] plusOne(int[] digits) {
        boolean add = true;
        int i = digits.length - 1;
        while (i >= 0 && add) {
            add = false;
            digits[i] = digits[i] + 1;
            if (digits[i] == 10) {
                digits[i] = 0;
                add = true;
            }
            i--;
        }
        if (digits[0] == 0) {
            int[] sol = new int[digits.length + 1];
            sol[0] = 1;
            return sol;
        }
        return digits;
    }
}