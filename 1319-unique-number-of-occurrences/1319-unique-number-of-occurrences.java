class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        boolean[] isUnique = new boolean[1001];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            int value = map.get(key);
            if (!isUnique[value]) {
                isUnique[value] = true;
            } else {
                return false;
            }
        }
        return true;
    }
}