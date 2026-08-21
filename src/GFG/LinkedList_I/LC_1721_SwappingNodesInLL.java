package GFG.LinkedList_I;

public class LC_1721_SwappingNodesInLL {
    public Node swapNodes(Node head, int k){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=k;i++){
            fast=fast.next;
        }
        while (fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        fast= head;
        for(int i=1;i<=k-1;i++){
            fast=fast.next;
        }
        int temp = fast.val;
        fast.val=slow.val;
        slow.val=temp;
        return head;
    }
}
