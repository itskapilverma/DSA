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
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0), curr=dummy;

        while(a!=null && b!=null){
            if(a.val<b.val){
                curr.next=a;
                a=a.next;
            }

            else{
                curr.next=b;
                b=b.next;
            }
            curr=curr.next;
        }
        curr.next=(a!=null)?a:b;

        return dummy.next;
    }
}