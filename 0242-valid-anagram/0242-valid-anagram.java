class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] alphabet = new int[26];
        
        for (char c : s.toCharArray()) {
            alphabet[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            alphabet[c - 'a']--;
        }
        
        for (int index : alphabet) {
            if (index != 0) {
                return false;
            }
        }
        return true;
    }
}