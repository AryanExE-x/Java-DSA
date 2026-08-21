package GFG.STRINGS;

public class substring_ofString_sum {
    static void main(String[] args) {
        String str = "Aryan Prasad";
        System.out.println(str.substring(3));  /*index input se aage ka saara*/
        System.out.println(str.substring(3,7));  /*index-> 3 to 6 tak print karega*/  //(start, end-1)
        System.out.println(str.substring(0,str.length()));  /*index-> 0 to n-1 tak print karega*/
        System.out.println();

        /*Print all substrings*/

        String s = "123";
        int sum=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub = s.substring(i,j+1);
                sum+=Integer.parseInt(sub);
                System.out.print(sub + " ");   //(start,end+1) so that it goes-> start to end
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
