package GFG.LinkedList_I;

public class LC_detectLoopInLL {
    public static boolean detectLoop(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;  /*its a loop*/
        }
        return false;  /*not a loop*/
    }
}
