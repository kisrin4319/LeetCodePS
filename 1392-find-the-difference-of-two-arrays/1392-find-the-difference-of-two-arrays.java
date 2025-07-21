class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        // 각각 복사해서 차집합
        Set<Integer> onlyIn1 = new HashSet<>(set1);
        onlyIn1.removeAll(set2); // nums1에는 있지만 nums2에는 없는 값

        Set<Integer> onlyIn2 = new HashSet<>(set2);
        onlyIn2.removeAll(set1); // nums2에는 있지만 nums1에는 없는 값

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(onlyIn1));
        result.add(new ArrayList<>(onlyIn2));

        return result;
    }
}