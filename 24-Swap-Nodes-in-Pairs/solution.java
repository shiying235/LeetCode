/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if( head==null || head.next == null) return head;
        ListNode ln = new ListNode(-1);
        ln.next = head;
        ListNode current = ln;
        while( current.next != null && current.next.next != null){
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return ln.next;
        // ListNode newHead= head.next;
        // ListNode currentNode =head;
        // ListNode swapNode =head.next;
        // while(currentNode!=null&&swapNode!=null){
        //     ListNode nextNode =swapNode.next;
        //     swapNode.next=currentNode;
        //     currentNode.next=nextNode;
        //     currentNode=nextNode;
        //     swapNode=currentNode.next;
        // }
        // return newHead;
    }
}