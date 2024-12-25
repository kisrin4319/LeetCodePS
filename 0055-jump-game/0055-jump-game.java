import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static boolean[] isJumped;
    public boolean canJump(int[] nums) {

        isJumped = new boolean[nums.length];

        Queue<Position> q = new LinkedList<>();
        
        int index = 0;

        q.add(new Position(index,nums[index]));
        isJumped[index] = true;

        while (!q.isEmpty()) {
            Position p = q.poll();
            int px = p.index;
            int jx = p.index + p.jump;

            for (int i = px; i <= jx; i++){
                if (i<nums.length && !isJumped[i]){
                    q.add(new Position(i,nums[i]));
                    isJumped[i] = true;
                }
            }
        }
        return isJumped[nums.length-1];
    }
}
class Position {
    int index;
    int jump;

    Position(int index, int jump) {
        this.index = index;
        this.jump = jump;
    }
}