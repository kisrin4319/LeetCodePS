class Solution {
    public boolean canJump(int[] nums) {
        int position = nums.length-1;
        for(int index = position-1; index >= 0; index--) {
            if (nums[index] + index >= position) {
                position = index;
            }
        }
        return position == 0;
    }
}