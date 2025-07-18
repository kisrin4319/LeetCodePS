class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = Integer.MIN_VALUE;

        List <Boolean> result = new ArrayList<>();

        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        for (int candy : candies) {
            if (candy+extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}