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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        int left=0;
        int r=arr.size()-1;
        while(left<=r){
            if(!arr.get(left).equals(arr.get(r))){
                return false;
            }
            left++;
            r--;
        }
        return true;
    }
}