class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0, sumBob = 0;
        Set<Integer> bobSet = new HashSet();
        int a = 0, b = 0;
        for(int x: aliceSizes){
            sumAlice += x;
        }
        for(int y: bobSizes){
            sumBob += y;
            bobSet.add(y);
        }
        int diff = (sumBob - sumAlice) / 2;
        for(int z: aliceSizes){
            if(bobSet.contains(z + diff)){
                a = z;
                b = z + diff;
                break;
            }
        }
        return new int[]{a,b};
    }
}