class RecentCounter {

    Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }
    
    public int ping(int t) {
        // 현재 요청 추가
        q.add(t);
        
        // t - 3000보다 작은 요청은 제거
        while (q.peek() < t - 3000) {
            q.poll();
        }

        // 남은 요청의 개수가 [t - 3000, t] 범위 내 요청 수
        return q.size();
    }
}