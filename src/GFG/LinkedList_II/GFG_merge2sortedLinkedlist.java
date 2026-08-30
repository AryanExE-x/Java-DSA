package GFG.LinkedList_II;

public class GFG_merge2sortedLinkedlist {
    public Node merge(Node head1, Node head2){
        Node i = head1;
        Node j = head2;
        Node dummy = new Node(-1);
        Node k = dummy; //points to dummy
        while(i!=null && j!=null){
            if(i.val<=j.val){
                k.next=i;  //connect node to i
                i=i.next; //move forward after each iteration
            }
            else{
                k.next=j; //connect node to j
                j=j.next; //move forward after each iteration
            }
            k=k.next; //move k forward in each iteration
        }
        if(i==null) k.next=j;
        else k.next=i; //if j==null
        return dummy.next;
    }
}
