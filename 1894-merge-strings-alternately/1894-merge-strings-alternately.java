class Solution {
    public String mergeAlternately(String word1, String word2) {

        int word1Len = word1.length();
        int word2Len = word2.length();

        char[] ch = new char[word1Len+word2Len];

        int word1Index = 0;
        int word2Index = 0;
        int idx = 0;

        while(idx<word1Len+word2Len) {
            if (word1Index <word1Len) {
                ch[idx++] = word1.charAt(word1Index);
                word1Index++;
            }
            if (word2Index < word2Len) {
                ch[idx++] = word2.charAt(word2Index);
                word2Index++;
            }
        }

        return String.valueOf(ch);        
    }
}