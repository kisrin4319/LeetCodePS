class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;

        if (k ==0 || len == 1) {
            return;
        }

        int[] temp = new int[k];
        System.arraycopy(nums, len-k, temp, 0, k);
        int pointer = len-k-1;
        int index = len-1;
        while(pointer >= 0) {
            nums[index] = nums[pointer];
            index--;
            pointer--;
        }
        System.arraycopy(temp,0,nums,0,k);
    }
}