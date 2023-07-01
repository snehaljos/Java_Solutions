package NeetCode150;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev=null,curr=head,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }
    public static class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public static void main(String[] args){
        ListNode ne1=new ListNode(1);

        ListNode ne2=new ListNode(2);
        ListNode ne3=new ListNode(3);
        ListNode ne4=new ListNode(4);
        ListNode ne5=new ListNode(5);
        ne1.next=ne2;
        ne2.next=ne3;
        ne3.next=ne4;
        ne4.next=ne5;
        ListNode res=reverseList(ne1);
        System.out.println(res.val);
    }
}
