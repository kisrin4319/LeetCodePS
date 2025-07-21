class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {


        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            boolean isDuplicate = false;
            for (int num2 : nums2) {
                if (num == num2) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                set1.add(num);
            }
        }

        for (int num : nums2) {
            boolean isDuplicate = false;
            for (int num2 : nums1) {
                if (num == num2) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                set2.add(num);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> res1 = new ArrayList<>(set1);
        List<Integer> res2 = new ArrayList<>(set2);
        result.add(res1);
        result.add(res2);
        return result;
    }
}