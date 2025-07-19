class Solution {
    public void moveZeroes(int[] nums) {

        int index = nums.length - 1;

        //뒤에서부터 채워지는 0의 위치
        int zeroPoint = nums.length - 1;

        while(index >= 0) {
            if (nums[index] == 0) {
                for (int i = index; i < zeroPoint; i++) {
                    nums[i] = nums[i+1];
                }
                nums[zeroPoint--] = 0;
            }
            index--;
        }
    }
}