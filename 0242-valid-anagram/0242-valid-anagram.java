class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] sarr = new int[26];
        int[] tarr = new int[26];


        for (int i =0; i<s.length();i++) {
            sarr[s.charAt(i)-'a']++;
            tarr[t.charAt(i)-'a']++;
        }

        boolean result = true;

        for (int i =0; i<sarr.length;i++) {
            if (sarr[i]!=tarr[i]) {
                result = false;
                break;
            }
        }
        return result;
        
    }
}