/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode walker = head;
        ListNode runner = head;
        while(n!=0){
            runner = runner.next;
            n--;
        }
        if(runner==null){
            return head.next;
        }
        while(runner.next!=null){
            runner = runner.next;
            walker = walker.next;
        }
        walker.next = walker.next.next;
        return head;

    }
}