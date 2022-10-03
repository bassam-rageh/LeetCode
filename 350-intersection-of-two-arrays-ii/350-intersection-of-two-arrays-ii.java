class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.length; i++) {
            if (map1.containsKey(nums1[i]))
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            else
                map1.put(nums1[i], 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map2.containsKey(nums2[i]))
                map2.put(nums2[i], map2.get(nums2[i]) + 1);
            else
                map2.put(nums2[i], 1);

        }
        ArrayList<Integer> sol = new ArrayList<Integer>();
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                int x = min(entry.getValue(), map2.get(entry.getKey()));
                for (int i = 0; i < x; i++) {
                    sol.add(entry.getKey());
                }
            }
        }
        int[] arr = new int[sol.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sol.get(i);
        }
        return arr;
    }

    int min(int x, int y) {
        if (x < y)
            return x;
        return y;
    }
}