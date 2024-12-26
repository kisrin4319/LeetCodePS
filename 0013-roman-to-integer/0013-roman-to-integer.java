class Solution {
    public int romanToInt(String s) {

        int sum = 0;

        char[] roman = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] value = {1, 5, 10, 50, 100, 500, 1000};

        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<roman.length; i++) {
            hm.put(roman[i], value[i]);
        }


        int idx = 0;
        while(idx < s.length()-1) {

            int currValue = hm.get(s.charAt(idx));
            int nextValue = hm.get(s.charAt(idx+1));

            if(currValue < nextValue) {
                sum = sum + (nextValue - currValue);
                idx += 2;
            } else {
                sum += currValue;
                idx += 1;
            }
        }
        if (idx == s.length()-1) {
            sum += hm.get(s.charAt(idx));
        }

        return sum;
    }
}