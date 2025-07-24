class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        int n = senate.length();

        // 각 진영의 인덱스를 큐에 저장
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }

        // 큐가 빌 때까지 반복
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int rIndex = radiant.poll();
            int dIndex = dire.poll();

            // 인덱스가 작은 쪽이 상대를 밴하고 살아남아 큐에 다시 들어감
            if (rIndex < dIndex) {
                radiant.offer(rIndex + n); // 다음 라운드를 위해 순환 위치 추가
            } else {
                dire.offer(dIndex + n);
            }
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}