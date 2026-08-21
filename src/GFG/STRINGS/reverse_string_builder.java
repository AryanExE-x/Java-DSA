package GFG.STRINGS;

public class reverse_string_builder {
    static void main(String[] args) {
        String s= "aryan";
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb);
        sb.append(" prasad");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        int i=0; int j=sb.length()-1;
        while(i<=j){
            char temp1=sb.charAt(i);
            char temp2=sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(sb);

        sb.deleteCharAt(0);  //O(n), heavy process since all the rest char are shifting. costly process.
        System.out.println(sb);
        sb.insert(0,'A');
        System.out.println(sb);
        sb.delete(0,6); //0 to 5 delete
        System.out.println(sb);

        /*IDEAL PROCESS to reverse*************/
        String x = "Aditya";
        StringBuilder k = new StringBuilder(x);
        k.reverse();
        x = k.toString();
        System.out.println(x);
    }
}
