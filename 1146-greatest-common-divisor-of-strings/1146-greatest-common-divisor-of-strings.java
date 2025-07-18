class Solution {
    public String gcdOfStrings(String str1, String str2) {

        int index = 0;
        String answer = "";
        String gcd = "";
        String divisor = str1.length() > str2.length() ? str1 : str2;

        while(gcd.length()<divisor.length()) {
            gcd = divisor.substring(0,index);
            if (str1.replaceAll(gcd, "").isEmpty() && str2.replaceAll(gcd, "").isEmpty()) {
                if (answer.length() < gcd.length()) {
                    answer = gcd;
                }
            }
            index++;
        }
        return answer;
    }
}