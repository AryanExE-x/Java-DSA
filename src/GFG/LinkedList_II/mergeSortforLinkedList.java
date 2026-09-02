package GFG.LinkedList_II;
//TODO QUESTION- TWO UNSORTED LINKEDLIST. MERGESORT THEM!!
//slow 1x fast 2x
//*in odd- todna hai when fast.next = null [1-2-3-4-5]
//*in even- todna hai when fast.next.next = null [1-2-3-4-5-6]
//fir dono mein magic laga do sorted ban jayenge
//fir merge krdo
public class mergeSortforLinkedList {
    public static Node mergeSort(Node head){
        if(head.next==null) return head; //base case- 1 size ki ll. single node is already sorted
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){ //*REFER TO COMMENTS ABOVE
            slow=slow.next;
            fast=fast.next.next;
        }
        Node head2= slow.next; //mark karke rakh lo pehle se
        slow.next=null; //break krdo
        //!apply magic keep breaking recursively and then keep merging it using merge function
        head = mergeSort(head);
        head2 = mergeSort(head2);
        return merge(head,head2); //merge krdo
    }
    public static Node merge(Node head1,Node head2){
        Node i = head1;
        Node j = head2;
        Node dummy = new Node(-1);
        Node k = dummy;
        while (i!=null && j!=null){
            if(i.val<=j.val){
                k.next=i;
                i=i.next;
            }
            else{
                k.next=j;
                j=k.next;
            }
            k=k.next;
        }
        if(i==null) k.next=j;
        else k.next=i;
        return dummy.next;
    }

}
