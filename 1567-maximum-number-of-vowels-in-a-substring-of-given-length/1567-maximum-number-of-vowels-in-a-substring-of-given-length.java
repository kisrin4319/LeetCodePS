class Solution {
    public int maxVowels(String s, int k) {

        int maxLen = 0;
        int vowelCount = 0;

        for(int i = 0; i<k; i++) {
            if (isVowel(s.charAt(i))) {
                vowelCount++;
            }
        }
        maxLen = vowelCount;

        for(int i = k; i <s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                vowelCount++;
            }
            if (isVowel(s.charAt(i-k))) {
                vowelCount--;
            }
            maxLen = Math.max(maxLen, vowelCount);
        }

        return maxLen;
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}