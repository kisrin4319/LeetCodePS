class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        HashMap<Integer, Integer> hm = new HashMap<>();


        for (int index = 0; index < nums.length; index++) {
            hm.put(nums[index], index);
        }

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i]) && hm.get(target - nums[i]) != i) {
                result[0] = i;
                result[1] = hm.get(target - nums[i]);
                break;
            }
        }
        
        return result;
    }
}