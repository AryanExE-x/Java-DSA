package GFG.STRINGS;

public class built_in_methods {
    static void main(String[] args) {
        String s = "Aryan Prasad";
        System.out.println(s.indexOf("a")); /*returns the first occurrence*/
        System.out.println(s.lastIndexOf("a")); /*returns the last occurrence*/
        //if char is not present in the string, java will return -1 as the index.

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        String x="Abhinav";
        System.out.println(x.contains("Abhi"));  /*returns in true/false*/
        System.out.println(x.startsWith("a"));   /*returns in true/false*/
        System.out.println(x.endsWith("v"));   /*returns in true/false*/

        String a = "harsh";
        String b = "harmeet";
        System.out.println(a.compareTo(b));
        //m n o p q r-> s. s is greater than 6 numbers from m.
        String c = "harshitam";
        System.out.println(c.compareTo(a));  /*extra letters agar all letters common hai chote wale ke*/
        System.out.println(a.compareTo(c));
        /*make a function of compareTo*/

        System.out.println(a.concat(b));
        a=a+b;
        b+=b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(10+(20+"aryarn"));

        int num=120;
        String k = Integer.toString(num);
        System.out.println(k);

        int number=201312312;
        String sizeOfNum = "" + number;
        System.out.println(sizeOfNum.length());

        double trailingzeroes=000.0123000;
        String count = "" + trailingzeroes;
        System.out.println(count.length());  /*0.0123 hi count honge not the rest of the zeroes*/

        String strr="58948";
        int z= Integer.parseInt(strr);
        System.out.println(z+1); //58949 ayega since its converted to int and added 1.

    }
}
