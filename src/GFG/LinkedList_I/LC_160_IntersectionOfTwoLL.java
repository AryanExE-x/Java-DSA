package GFG.LinkedList_I;
/*!MEDIUM LEVEL*/
public class LC_160_IntersectionOfTwoLL {
    public Node getIntersection(Node head1, Node head2){
        int length1=0;
        Node temp1=head1;
        while (temp1!=null){
            temp1=temp1.next;
            length1++;
        }

        int length2=0;
        Node temp2=head2;
        while (temp2!=null){
            temp2=temp2.next;
            length2++;
        }
        /*temp variables null pe chale gye the. get them back to head*/
        temp1=head1;
        temp2=head2;

        if(length1>length2) { /*?temp1 ko aage bhejenge*/
            int shift=length1-length2;
            for(int i=1;i<=shift;i++){
                temp1=temp1.next;

            }
        }
        else{ /*?temp2 ko aage bhejenge*/
            int shift=length2-length1;
            for(int i=1;i<=shift;i++){
                temp2=temp2.next;

            }
        }
        /*aage badho till they intersect*/
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}
