package GFG.LinkedList_I;

public class LC_detectLoopInLL {
    public static boolean detectLoop(Node head){
        Node slow = head;
        Node fast = head;
//    fast.next       → need fast != null
//    fast.next.next  → need fast != null AND fast.next != null
        while(fast!=null && fast.next!=null){ //to avoid null pointer exception
            slow=slow.next;
            fast=fast.next.next;
//            fast != null
//            YES
//            fast.next != null
//            YES
//            safe to do fast.next.next
            if(slow==fast) return true;  /*its a loop*/
        }
        return false;  /*not a loop*/
    }
}
