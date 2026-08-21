package GFG.LinkedList_I;

public class traverseLinkedList {
    private static int get(Node head,int idx){
        for(int i=0;i<idx;i++){
            head=head.next;
        }
        return head.val;
    }
    public static void main(String[] args){
        Node a = new Node(19);
        Node b = new Node(29);
        Node c = new Node(39);
        Node d = new Node(49);
        a.next=b; b.next=c; c.next=d;
        System.out.println(get(a,2));

    }
}
