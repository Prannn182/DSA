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
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        temp=dummy; //emp pointer has already reached the end of the list — it’s null
        for(int i=0;i<length-n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return dummy.next;
    }
}