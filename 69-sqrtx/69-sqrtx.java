class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        long a = 1, b = x;
        long sq = (a + b) / 2;
        while (a < b) {
            if (sq * sq <= x && (sq + 1) * (sq + 1) > x) {
                return (int) sq;
            }
            if (sq * sq > x) {
                b = sq - 1;
            } else {
                a = sq + 1;
            }
            sq = (a + b) / 2;
        }
        return (int) sq;
    }
}