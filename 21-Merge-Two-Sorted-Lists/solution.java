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
        ListNode previous=l1;
        while(current!=null&&l2!=null){
            if(current.val>=l2.val){
                ListNode next = current.next;
                current = new ListNode(l2.val);
                previous.next=current;
                current.next=next;
                previous=current;
                current=current.next;
                l2=l2.next;
            }
            else{
                previous=current;
                current=current.next;
            }
        }
        while(l2!=null){
            previous=current;
            current=new ListNode(l2.val);
            previous.next=current;
            current=current.next;
            previous=previous.next;
            l2=l2.next;
        }
        return l1;
    }
}