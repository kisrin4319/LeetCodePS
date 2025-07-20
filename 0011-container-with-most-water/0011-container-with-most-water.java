class Solution {
    public int maxArea(int[] height) {


        int left = 0;
        int right = height.length-1;
        int size = Integer.MIN_VALUE;


        while(left < right) {

            size = Math.max(size, ( (right-left) * Math.min(height[left],height[right])));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return size;        
    }
}