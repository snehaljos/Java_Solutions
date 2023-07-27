package NeetCode150;
class Solution11 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int pos=0,count=0;
        ListNode tail=head,curr=head,prev=null;
        while(tail!=null){
            count++;
            tail=tail.next;
        }
        if(count==1 && n!=0) return null;
        pos=count-n;
        if(pos==0){
            head=head.next;
            return head;
        }
        while(pos>0){
            pos--;
            prev=curr;
            curr=curr.next;
        }
        prev.next=curr.next;
        return head;

    }
}
public class RemoveNthNodeFromEndofList {
    public static void main(String[] args) {

    }
}
