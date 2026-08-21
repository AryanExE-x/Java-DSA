package GFG.LinkedList_I;
class node{   /*user defined data type*/
    int val;
    node next;
    node(int val){
        this.val=val;
    }
}
class linkedlist{ /*user defined data structure */
    Node head;  //null
    Node tail;  //null
    int size;

    int search(int val){
        if(head==null) return -1;
        Node temp = head;
        int idx=0;
        while(temp!=null){
            if(temp.val==val) return idx;
            temp= temp.next;
            idx++;
        }
        return -1;
    }
    void insert(int idx,int val){
        if(idx<0 || idx>size){
            System.out.println("Invalid Index");
        }
        else if(idx==0) insertAtHead(val);
        else if(idx==size) addAtTail(val);
        else{
            Node temp= head;
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next=temp.next;
            temp.next=t;
            size++;

        }
    }

    void delete(int idx){
        if(idx<0 || idx>size){
            System.out.println("invalid index");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        Node temp = head;
        for(int i=0;i<idx-1;i++){
            temp = temp.next; /*delete krne wale se ek pehle wala element*/
        }
        temp.next=temp.next.next;  /*!this is deleting the element*/
        if(idx==size-1) tail = temp; /* IF we are deleting the tail element*/
        size--;
    }

    int get(int idx){
        Node temp = head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }

    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail==null) head = tail = temp; /*agar ll khaali hui tab ka case*/
        else{
            tail.next = temp;  /*connect hojayega temp se*/
            tail = temp;  /*temp ko tail bana denge*///tail ko le aao temp pe
        }
        size++;
    }

    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp; /*agar ll khaali hui tab ka case*/
        else{
            temp.next = head;  /*connect hojayega temp se*/
            head = temp;  /*head ko le aao temp pe. ie temp ko head bana diya*/
        }
        size++;
    }

    void deleteAtHead(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        head=head.next; /*element delete aur aage wala el-> head*/
        /***1 element. EL delete -> head points to null*/ //?special case with 1 el in ll
        if(head==null) tail = null; /*for size ==1..only 1 element in the linked list*/
        size--;
    }

    void display(){
        if(head==null) return;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp= temp.next;
        }
        System.out.println();
    }

    int length(){
        if(head==null) return 0;
        Node temp = head;
        int length=0;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        return length;
    }

}
public class LinkedListDataStr {
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.display();
        ll.insert(2,50);
        ll.display();
        ll.addAtTail(80);
        ll.insertAtHead(-15);
        ll.display();
        System.out.println(ll.get(1));
    }
}
