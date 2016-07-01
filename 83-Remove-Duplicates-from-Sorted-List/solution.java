/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ln=head;
        while(head.next!=null){
             if(head.val==head.next.val) head.next=head.next.next;
             else head=head.next;
        }
        return head;
    }
}