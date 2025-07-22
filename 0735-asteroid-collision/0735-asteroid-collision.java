class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();
        int index = 0;
        while(index < asteroids.length) {
            int value = asteroids[index];
            if (st.isEmpty()) {
                st.push(value);
                index++;
            } else {
                int tp = st.peek();
                if (value * tp < 0 && value < 0) {
                    if (Math.abs(value) < Math.abs(tp)) {
                        index++;
                    } else if (Math.abs(value) > Math.abs(tp)) {
                        st.pop();
                    } else {
                        st.pop();
                        index++;
                    }
                } else {
                    st.push(value);
                    index++;
                }
            }
        }
        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
}