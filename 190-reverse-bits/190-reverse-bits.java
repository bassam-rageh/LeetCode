public class Solution {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int x = 0;
        for (int i = 0; i < Integer.BYTES * 8; i++) {
            x = (int) ((x << 1) | (n & 1));
            n = n >>> 1;
        }
        return x;
    }
}
