class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> hs = new HashSet<>();

        while(n!=1) {
            int sum  = 0;
            int temp = n;

            while(temp !=0) {
                int r = temp % 10;
                temp = temp/10;
                sum+= r*r;
            }
            if (hs.contains(sum)) {
                return false;
            }
            hs.add(sum);
            n = sum;
        }
        return true;
    }
}