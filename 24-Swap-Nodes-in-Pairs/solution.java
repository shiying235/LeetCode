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
        if(head.next==null) return head;
        ListNode newHead= head.next;
        ListNode currentNode =head;
        ListNode swapNode =head.next;
        while(currentNode!=null&&swapNode!=null){
            ListNode nextNode =swapNode.next;
            swapNode.next=currentNode;
            currentNode.next=nextNode;
            currentNode=nextNode;
            swapNode=currentNode.next;
        }
        return newHead;
    }
}