package GFG.LinkedList_I;

public class LC_kth_from_end {
     int kthFromEnd(Node head, int k) {
        // Find length
        int len = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
         // Invalid k
         if (k <= 0 || k > len) return -1;
         // kth from end = (len - k + 1)th from start
        int position = len - k + 1;
        // Move to that position
        temp = head;
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    /*One pass solution*/
    int kthEnd(Node head, int k){
        Node slow = head;
        Node fast = head;

        //fast ko k steps aage leke jao
        for(int i=1;i<=k;i++){
            if(fast==null) return -1;
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.val;
    }
}
