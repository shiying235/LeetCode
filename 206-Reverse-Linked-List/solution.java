/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return;
        ListNode secondNode=head.next;
        ListNode thirdNode =secondNode.next;
        
        secondNode.next=head;
        head.next=null;
        
        if(thirdNode==null) return;
        
        ListNode currentNode=thirdNode;
        ListNode previousNode=secondNode;
        while(currentNode!=null){
            ListNode nextNode =currentNode.next;
            
            currentNode.next=previousNode;
            previousNode=currentNode;
            currentNode=nextNode;
            
        }
        previousNode=head;
    }
}