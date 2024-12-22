class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
        }

        int value = 0;
        int answer  = 0;

        for (int key : map.keySet()) {
            if (value < map.get(key)) {
                value = Math.max(value, map.get(key));
                answer = key;
            }
        }
        return answer;
    }
}