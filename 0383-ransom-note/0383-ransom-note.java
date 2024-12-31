class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {


        int[] alphabet = new int[27];

        boolean result = true;

        for (int i =0; i < magazine.length(); i++) {
            alphabet[magazine.charAt(i)-'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            int ch = ransomNote.charAt(i)-'a';
            if (alphabet[ch] == 0) {
                result = false;
                break;
            } else {
                alphabet[ch]--;
            }

        }
        return result;
    }
}