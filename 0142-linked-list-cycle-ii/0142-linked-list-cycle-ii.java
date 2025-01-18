/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {


        ListNode origin = head;
        ListNode fast = head;
        boolean isCycle = false;

        while(fast != null && fast.next != null) {

            head = head.next;
            fast = fast.next.next;

            if (head == fast) {
                isCycle = true;
                break;
            }
        }

        if (isCycle) {
            while(origin != fast) {
                origin = origin.next;
                fast = fast.next;
            }
            return origin;
        }
        
        return null;
    }
}