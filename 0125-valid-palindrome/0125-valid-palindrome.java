class Solution {
    public boolean isPalindrome(String s) {


        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;

        boolean result = true;

        while(start < end) {
            if (!isAlphanumeric(s.charAt(start))) {
                start++;
                continue;
            }

            if (!isAlphanumeric(s.charAt(end))) {
                end--;
                continue;
            }

            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
    boolean isAlphanumeric(char c) {
        return Character.isLetterOrDigit(c);
    }
}