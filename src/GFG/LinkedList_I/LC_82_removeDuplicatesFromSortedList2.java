package GFG.LinkedList_I;
//!leetcode-82. delete the duplicates n even the element which appears more than once
//!
//! IMPORTANT
//!
public class LC_82_removeDuplicatesFromSortedList2 {
    public Node deleteDuplicates(Node head){
        Node dummy = new Node(-1);
        Node t = dummy;
        Node i = head; //i will travel linked list//
        while(i!=null){
            if(i.next==null || i.val!=i.next.val){
                t.next=i;
                t=i;
                i=i.next;
            }
            else{  /* i.val == i.next.val */
                Node j  = i.next;
                while(j!=null && j.val == i.val){
                    j=j.next;
                }
                i=j;
            }
        }
        t.next=i;  /*important case for last wale iteration for i @null*/
        return dummy.next;
    }
}
