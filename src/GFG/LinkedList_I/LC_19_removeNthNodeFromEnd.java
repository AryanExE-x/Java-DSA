package GFG.LinkedList_I;

public class LC_19_removeNthNodeFromEnd {
    public Node removeNthFromEnd(Node head, int n) {
        Node fast = head;
        Node slow = head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }

        if(fast==null){
            return head.next;
        }

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
