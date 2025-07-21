class Solution {
    public boolean closeStrings(String word1, String word2) {


        if (word1.length() != word2.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        //조건 1 : 문자 집합이 동일해야함
        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }

        //조건 2 : 문자 등장 빈도 분포가 동일해야함
        List<Integer> frequency1 = new ArrayList<>(map1.values());
        List<Integer> frequency2 = new ArrayList<>(map2.values());
        Collections.sort(frequency1);
        Collections.sort(frequency2);

        return frequency1.equals(frequency2);
    }
}