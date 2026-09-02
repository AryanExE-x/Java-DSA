package GFG.LinkedList_II;
//do dummy nodes banao ek mein x se chote values ko add karo doosre mein x se bade
// if currentNode<x then t1.next to that node and move t ahead +++ t1=t1.next
//if currentNode>x then t2.next to that node and move t ahead. +++ t2=t2.next .simpleee
//end mein dono ke .next ko null krdo to end the linkedlists
//and now t1 ka next = dummy2.next matlab t2 ka head and connect them
public class LC_86_partitionList{
    public static Node partitionList(Node head, int x){
        Node dummy1= new Node(-1);
        Node dummy2= new Node(-1);
        Node temp1 = dummy1; //smaller
        Node temp2 = dummy2; //larger
        Node temp = head;
        while(temp!=null){
            if(temp.val<x){
                temp1.next=temp;
                temp1=temp1.next;
                temp=temp.next;
            }
            else{
                temp2.next=temp;
                temp2=temp2.next;
                temp=temp.next;
            }
        }
        temp1.next=dummy2.next; //temp1 ke next ko null mat kro instead connect it with dummy2.next yani head of larger linkedlist
        temp2.next=null; //end the linkedlist of dummy2 to end
        return dummy1.next;
    }


}