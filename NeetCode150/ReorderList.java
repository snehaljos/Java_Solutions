package NeetCode150;
  class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      public  ListNode reverseList(ListNode head) {
          ListNode prev=null;
          ListNode curr=head;
          ListNode next=null;
          while(curr!=null){
              next=curr.next;
              curr.next=prev;
              prev=curr;
              curr=next;
          }

          return prev;
      }
      public ListNode reorderList(ListNode head){
        if(head.next==null) return head;
        ListNode slow=head,fast=head.next;
        while(fast.next!=null && fast!=null){
            slow=slow.next;
           fast= (fast.next.next == null ? fast.next:fast.next.next);
        }
        ListNode tail=reverseList(slow.next);
        ListNode temp1,temp2,left=head;
        while(tail!=null){
            temp1=left.next;
            left.next=tail;
            left=temp1;
            temp2=tail.next;
            tail.next=left;
            tail=temp2;
        }
        left.next=null;
        return head;
      }
}
public class ReorderList {
    public static void main(String[] args) {
            ListNode l1=new ListNode(1);
            ListNode l2=new ListNode(2);
            ListNode l3=new ListNode(3);
            ListNode l4=new ListNode(4);
            ListNode l5=new ListNode(5);
            l1.next=l2;
            l2.next=l3;
            l3.next=l4;
            l4.next=l5;
            l5.next=null;
            ListNode h=l1.reorderList(l1);
            System.out.println(h.next.val);
    }
}
