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
    public ListNode removeNthFromEnd(ListNode head, int n) {
     //calculate size
     int size=0;
     ListNode temp=head;
     while(temp!=null){
        temp=temp.next;
        size++;
     }   

     if(n==size){
         //removeFirst
        return head.next;
     }

     //find node just before the target node
     int i=1;
     int idx=size-n;
     ListNode prev=head;
     while(i<idx){
        prev=prev.next;
        i++;
     }

     //unlink the target node
     prev.next=prev.next.next;
     return head;
    }
}