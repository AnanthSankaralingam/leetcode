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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
            return null;
        ListNode walker = head;
        ListNode runner = head;
        ListNode prev = null;
        int count = 0;
        while(runner.next!=null && runner.next.next!=null)
        {
            prev = walker;
            if(count!=0)
                walker = walker.next;
            runner = runner.next.next;
            count++;
        }
        if(runner.next!=null &&count!=0)
            walker = walker.next;
        if(walker.next !=null )
        {
            walker.next = walker.next.next;
        }
        
        return head;
    }
}