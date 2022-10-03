class Solution {
    public int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }
        boolean[] prime = new boolean[n];
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (!prime[i]) {
                for (int j = i; i * j < n; j++) {
                    prime[i * j] = true;
                }
            }
        }
        int count = 0;
        for (int j = 0; j < prime.length; j++) {
            if (!prime[j]) {
                count++;
            }
        }
        return count;
    }
}