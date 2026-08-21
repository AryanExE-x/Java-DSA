package GFG.LinkedList_I;

public class LC_middleOfLinkedList {
    int getMiddle(Node head){
        int length=0;
        Node temp= head;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        temp=head;
        for(int i=0;i<length/2;i++){
            temp=temp.next;
        }
        return temp.val;

    }

    /*SLOW FAST APPROACH*/

    int getMiddleSlowFast(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){ /*order is imp otherwise NULL POINTER EXCEPTION*/
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow.val;
    }
}
