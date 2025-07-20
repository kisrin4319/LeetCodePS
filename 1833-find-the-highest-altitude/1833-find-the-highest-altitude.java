class Solution {
    public int largestAltitude(int[] gain) {
        int height = 0, max = 0;
        for(int h : gain){
            height+= h;
            max = Math.max(max,height);
        }
        return max;        
    }
}