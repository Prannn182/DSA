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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode mid=mid(head);
        ListNode rightnode=mid.next;
        mid.next=null; // to distribute it into two halves
        ListNode left=sortList(head);
        ListNode right=sortList(rightnode);

      return merge(left,right);
    }
    public ListNode merge(ListNode list1,ListNode list2){
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        while(list1!=null&&list2!=null){
        if(list1.val<=list2.val){
          temp.next=list1;
          list1=list1.next;
        }else{
            temp.next=list2;
            list2=list2.next;
        }temp=temp.next;}
        if(list1!=null){
            temp.next=list1;
        }
        if(list2!=null){
            temp.next=list2;
        }
        return dummy.next;
    }
    public ListNode mid(ListNode head){
        if(head==null){
            return head;
        }

        ListNode slow=head,fast=head,prev=null;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
            
        }
        return prev;
}
}