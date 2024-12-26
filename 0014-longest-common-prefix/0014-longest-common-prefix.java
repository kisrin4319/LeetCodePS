class Solution {
    public String longestCommonPrefix(String[] strs) {

        HashMap<String,Integer> hs = new HashMap<>();

        for (String str : strs) {
            for(int i = 0; i < str.length(); i++) {
                hs.put(str.substring(0,i+1),hs.getOrDefault(str.substring(0,i+1),0)+1);
            }
        }

        int maxLength = 0;
        String result = "";

        for (String key : hs.keySet()) {
            if (hs.get(key) == strs.length && maxLength < key.length()) {
                maxLength = key.length();
                result = key;
            }
        }
        return result;
    }
}