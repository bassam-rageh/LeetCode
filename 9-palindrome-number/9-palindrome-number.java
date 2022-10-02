class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        long y = 0;
        long z = x;
        while(x >= 10) {
          y = y*10 + x%10;
          x = x/10;
        }
        y = y*10 + x;
        if (y == z)
          return true;
        return false;
    }
}