package GFG.STRINGS;
import java.util.ArrayList;
public class string_builders {
    static void main(String[] args) {
        ArrayList<Character> str = new ArrayList<>();
        str.add('a');
        str.add('b');
        str.add('c');
        System.out.println(str);

        StringBuilder sb = new StringBuilder(10); //we can set the capacity or input any string.
        System.out.println(sb);
        sb.append("Garg");
        System.out.println(sb);
        System.out.println(sb.length() + " " + sb.capacity());/*initial capacity(empty)->16. with text ->22*/
        sb.setCharAt(1,'o');
        System.out.println(sb);
        sb.append(" ashduabsduasdhuasdbasu");  //utni hi capacity ban jayegi.
        System.out.println(sb);
        System.out.println(sb.length() + " " + sb.capacity());/*initial capacity(empty)->16. with text ->22*/

        String t = sb.toString();
        System.out.println(t);
    }
}
