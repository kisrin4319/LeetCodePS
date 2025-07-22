class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Deque<Integer> st = new ArrayDeque<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            while (!st.isEmpty() && a < 0 && st.peekLast() > 0) {
                if (st.peekLast() < -a) {
                    st.pollLast();
                    continue;
                } else if (st.peekLast() == -a) {
                    st.pollLast();
                }
                destroyed = true;
                break;
            }

            if (!destroyed) {
                st.addLast(a);
            }
        }

        int[] res = new int[st.size()];
        int index = 0;

        for (int val : st) {
            res[index++] = val;
        }
        return res;
    }
}