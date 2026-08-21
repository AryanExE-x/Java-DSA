package GFG.LinkedList_I;

public class LC_removeDuplicatedFromSortedLL {
    public Node removeDuplicates(Node head){
        Node i = head;
        Node j = head;
        while(j!=null){
            if(i.val == j.val) j = j.next;
            else{
                i.next= j;
                i=j;
            }
        }
        i.next = j;
        return head;
    }
}
