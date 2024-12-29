class Solution {
    public int removeDuplicates(int[] nums) {

        int[] map = new int[200001];


        for (int num : nums) {
            if (map[num + 10000] < 2) {
                map[num + 10000]++;
            }
        }

        int start = 0;
        for (int i = 0; i < map.length; i++) {
            while (map[i] > 0) {
                nums[start] = i-10000;
                start++;
                map[i]--;
            }
        }
        return start;
    }
}