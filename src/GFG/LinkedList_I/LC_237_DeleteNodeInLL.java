package GFG.LinkedList_I;

public class LC_237_DeleteNodeInLL {
    public void deleteNode(Node head){
        head.val=head.next.val;
        head.next=head.next.next;
    }
}
