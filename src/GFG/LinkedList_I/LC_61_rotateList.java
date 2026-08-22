package GFG.LinkedList_I;

public class LC_61_rotateList {
    public int length(Node head){
        int len=0;
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        return len;
    }
    public Node rotateRight(Node head, int k) {
        if(head==null || head.next==null) return head;
        int n = length(head);
        k%=n;
        if(k==0) return head;
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=k+1;i++) {
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        Node a = slow.next; /*the point from where we need to break the ll*///? the head now.
        slow.next=null; /*breaking apart the linkedlist into 2 subparts*/
        Node tail = a; //store a in tail and move it using while till it ends @null
        while(tail.next!=null){ /*tail!=null pe tail will stop at null. so we cant connect to head*/
            tail=tail.next;
        }
        tail.next= head; //attach it to the head of first part of LL
        return a; //return head of the second part of LL which is at front now
    }
}
