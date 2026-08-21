package GFG.LinkedList_I;

import java.util.Scanner;

public class NodeOfLinkedList {
    public static void display(Node head){
        Node temp = head;
        System.out.println("While Loop");
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;  /*!!!very important!!!*/

        }
        System.out.println();

        System.out.println("For Loop");
        for(temp=head;temp!=null;temp=temp.next){
            System.out.print(temp.val+" ");
        }
        System.out.println();
    }

    public static void displayRec(Node head){
        if(head==null) return;
        System.out.print(head.val+" ");
        displayRec(head.next);
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Node a = new Node(input.nextInt());  //head node.
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node();
        d.val=40;
        //*Connect karenge..(Link karenge).
        a.next = b;
        b.next = c;
        c.next = d;

//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(c.next);
//        System.out.println(b.next.next);
//        System.out.println(d.next);
//        System.out.println(b.next.next.val);

        display(a);
        System.out.println("Recursion");
        displayRec(a);


    }
}
