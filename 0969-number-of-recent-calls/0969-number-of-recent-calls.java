class RecentCounter {

    Queue<Integer> q = new LinkedList<>();
    

    public RecentCounter() {
        
    }
    
    public int ping(int t) {
 
        if (q.isEmpty()) {
            q.add(t);
        } else {
            int size = q.size();
            for(int i =0; i< size; i++) {
                int v = q.poll();
                if (v >= t-3000 && v<=t) {
                    q.add(v);
                }
            }
            q.add(t);
        }
        return q.size();        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */