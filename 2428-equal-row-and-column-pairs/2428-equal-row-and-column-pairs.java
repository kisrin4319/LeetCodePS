class Solution {
    public int equalPairs(int[][] grid) {

        int n = grid.length;
        int count = 0;

        StringBuilder sb = new StringBuilder();

        HashMap<String,Integer> hm = new HashMap<String,Integer>();


        for (int row=0; row<n;row++) {
            for(int col =0; col<n;col++) {
                sb.append(grid[row][col]).append(",");
            }
            String rowKey = sb.toString();
            hm.put(rowKey,hm.getOrDefault(rowKey,0)+1);
            sb.setLength(0);
        }

        for (int col=0; col<n;col++) {
            for (int row=0; row<n; row++) {
                sb.append(grid[row][col]).append(",");
            }
            String colKey = sb.toString();
            count+= hm.getOrDefault(colKey,0);
            sb.setLength(0);
        }
        return count;
    }
}