import java.util.*;
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
    public boolean hasCycle(ListNode head) {
        //runner walker 
        ListNode walker = head, runner = head;
        while(runner != null && runner.next != null){
            walker = walker.next;
            runner = runner.next.next;
            if(walker == runner){
                return true;
            }
            
        }
        return false;
    }
}