package NeetCode150;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
class Solution12 {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node curr=head,copy;
        while(curr!=null){
            Node temp=new Node(curr.val);
            map.put(curr,temp);
            curr=curr.next;
        }
        curr=head;
        while(curr!=null){
            copy=map.get(curr);
            copy.next=map.get(curr.next);
            copy.random=map.get(curr.random);
            curr=curr.next;
        }
        return map.get(head);
    }
}
public class CopyListwithRandomPointer {
    public static void main(String[] args) {

    }
}
