/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        ListNode p=a, q=b;

        while(p!=q){
            p=(p==null)?b:p.next;
            q=(q==null)?a:q.next;
        }
        return p;
    }
}