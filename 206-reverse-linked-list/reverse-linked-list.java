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
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode last=null;
        while(temp!=null){
            ListNode next=temp.next; //idhr next ki current value h nayi node
            temp.next=last; //idhr hum temp.next ki purani value last or prev ko assign krenge which is null rn
            last=temp; // idhr last or prev will update and will have the value of temp
            temp=next; // assigning temp to next 
        }
        return last;
    }
}