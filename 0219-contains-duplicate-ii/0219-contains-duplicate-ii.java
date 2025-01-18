class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int index = 0; index<nums.length;index++) {
            if (hm.containsKey(nums[index])) {
                int idx = hm.get(nums[index]);
                if (Math.abs(idx - index) <= k) {
                    return true;
                }
            }
            hm.put(nums[index], index);
        }
        return false;
    }
}