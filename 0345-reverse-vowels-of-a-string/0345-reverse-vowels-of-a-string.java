class Solution {
    public String reverseVowels(String s) {

        int start = 0;
        int end = s.length()-1;
        char[] ch = s.toCharArray();

        while(start<end) {
            if (!isVowel(ch[start])) {
                start++;
            } else if (!isVowel(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }

        return String.valueOf(ch);
    }
    public boolean isVowel(char c) {
        char lower = Character.toLowerCase(c);
        if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
            return true;
        }
        return false;

    }
}