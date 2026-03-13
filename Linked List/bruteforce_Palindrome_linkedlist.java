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
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode newNode = new ListNode(curr.val);
            newNode.next = prev;
            prev = newNode;
            curr = curr.next;
        }
       ListNode p1=head;
       ListNode p2=prev;
       while(p1!=null&&p2!=null){
        if(p1.val!=p2.val){
            return false;
        }
        p1=p1.next;
        p2=p2.next;
       }
       return true;
    }
}
