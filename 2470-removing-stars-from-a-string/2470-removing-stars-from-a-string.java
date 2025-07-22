class Solution {
    public String removeStars(String s) {

        StringBuilder sb = new StringBuilder();

        Stack<Character> st = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (st.isEmpty()) {
                if (c != '*') {
                    st.push(c);
                }                
            } else {
                if (c != '*') {
                    st.push(c);
                } else {
                    st.pop();
                }
            }
        }
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}