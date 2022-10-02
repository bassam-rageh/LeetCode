class Solution {
    public int mySqrt(int x) {
        long a = 1, b = x;
        long sq = (a + b) / 2;
        while (a <= b) {
            if (sq * sq == x) {
                return (int) sq;
            }
            if (sq * sq > x) {
                b = sq - 1;
            } else {
                a = sq + 1;
            }
            sq = a + (b-a)/2;
        }
        return (int) b;
    }
}