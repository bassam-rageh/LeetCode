class Solution {
    public int mirrorReflection(int p, int q) {
        int x = p;
        int y = q;
        while (x % 2 == 0 && y % 2 == 0) {
            x /= 2;
            y /= 2;
        }
        if (y % 2 == 1 && x % 2 == 0) {
            return 2;
        } else if (y % 2 == 1 && x % 2 == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}