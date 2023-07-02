package NeetCode150;

public class MergeTwoSortedLists {
    public static ReverseLinkedList.ListNode mergeList(ReverseLinkedList.ListNode list1, ReverseLinkedList.ListNode list2){
        ReverseLinkedList.ListNode res=new ReverseLinkedList.ListNode();
        ReverseLinkedList.ListNode tail=res;
        while(list1!=null && list2!=null){
            if(list1.val> list2.val){
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
            else{
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }
            if(list1!=null){
                tail.next=list1;
            }
            if(list2!=null){
                tail.next=list2;
            }
        }
        return res;

    }
    public static ReverseLinkedList.ListNode reverseList(ReverseLinkedList.ListNode head) {
        ReverseLinkedList.ListNode prev=null,curr=head,next=null;
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
        ReverseLinkedList.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ReverseLinkedList.ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args){
       ListNode ne1=new ReverseLinkedList.ListNode(1);

        ListNode ne2=new ListNode(2);
        ListNode ne3=new ListNode(4);
        ne1.next=ne2;
        ne2.next=ne3;
        ReverseLinkedList.ListNode ne11=new ReverseLinkedList.ListNode(1);

        ListNode ne22=new ListNode(3);
        ListNode ne33=new ListNode(4);
        ne11.next=ne22;
        ne22.next=ne33;

        ReverseLinkedList.ListNode res=mergeList(ne1,ne11);
        System.out.println(res.val);
    }
}
