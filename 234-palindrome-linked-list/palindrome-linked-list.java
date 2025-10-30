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
    public ListNode middleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
       }
        public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode pres=head;
        ListNode next=pres.next;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;
            }
        } 
        return prev;
       }
    public boolean isPalindrome(ListNode head) {

       

      
     ListNode mid=middleNode(head);
     ListNode headsec=reverse(mid);
     ListNode reversehead=headsec;
     while(head!=null&& headsec!=null){
        if(head.val!=headsec.val){
            break;
        }
        head=head.next;
        headsec=headsec.next;
     }
     reverse(reversehead);
     return head==null || headsec==null;
    }
}