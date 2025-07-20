class Solution {
    public int largestAltitude(int[] gain) {


        int height = 0;

        int max = 0;

        for(int i=0;i<gain.length;i++){
            height+= gain[i];
            max = Math.max(max,height);
        }
        return max;        
    }
}