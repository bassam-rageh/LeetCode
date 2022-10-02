class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> sol = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            for (int j = 0; j < i - 1; j++) {
                row.add(sol.get(i - 1).get(j) + sol.get(i - 1).get(j + 1));
            }
            if (i > 0) {
                row.add(1);
            }
            sol.add(row);
        }
        return sol;
    }
}