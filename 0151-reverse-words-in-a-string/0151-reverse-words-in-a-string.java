class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int index = str.length-1;index>0;index--) {
            sb.append(str[index]).append(" ");
        }
        sb.append(str[0]);
        
        return sb.toString();        
    }
}