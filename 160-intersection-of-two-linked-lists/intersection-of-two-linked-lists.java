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
        for(ListNode p=a; p!=null; p=p.next){
            for(ListNode q=b; q!=null; q=q.next){
                if(p==q) return p;
            }
        }

        return null;
    }
}