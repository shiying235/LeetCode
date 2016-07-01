/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode current=l1;
        ListNode next=current.next;
        while(current!=null&&l2!=null){
            if(next.val>=l2.val&&current.val<=l2.val){
                ListNode ln = current.next;
                current.next = new ListNode(l2.val);
                current.next.next=current.next;
                l2=l2.next;
            }
            current=current.next;
            next=current.next;
        }
        while(l2!=null){
            current.next=new ListNode(l2.val);
            current=current.next;
            l2=l2.next;
        }
        return l1;
    }
}