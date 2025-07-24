class Solution {
    public String predictPartyVictory(String senate) {

        Queue<Character> q = new LinkedList<>();
        for(char c : senate.toCharArray()) {
            q.offer(c);
        }
        while(q.size() != 1 ) {
            char key =  q.poll();
            char removeElement = key == 'R' ? 'D' : 'R';
            if (!q.remove(removeElement)) {
                return key ==  'R' ? "Radiant" : "Dire";
            };
            q.offer(key);
        }
        return q.peek() == 'R' ? "Radiant" : "Dire";
    }
}