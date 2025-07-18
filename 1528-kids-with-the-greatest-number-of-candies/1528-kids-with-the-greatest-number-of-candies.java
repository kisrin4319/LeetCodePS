class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = Integer.MIN_VALUE;

        Boolean[] result = new Boolean[candies.length];

        for (int candy : candies) {
            max = Math.max(candy, max);
        }

        for (int index = 0; index < result.length; index++) {
            result[index] = candies[index] + extraCandies >= max;
        }
        return Arrays.asList(result);
    }
}