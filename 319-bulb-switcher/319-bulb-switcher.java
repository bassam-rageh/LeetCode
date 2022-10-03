class Solution {
    public int bulbSwitch(int n) {
        int count = 0,  x = 1;
        while(x * x <= n) {
            x++;
            count++;
        }
        return count;
    }
}