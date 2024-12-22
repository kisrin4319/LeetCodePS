class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int index : nums) {
           map.put(index, map.getOrDefault(index, 0) + 1);
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