package GFG.OOPS.KunalKushwaha_01.WrapperClass;
class   Numbers {
    int a;
    int b;

    Numbers(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public static void swap(Numbers nums) {
        int temp = nums.a;
        nums.a = nums.b;
        nums.b = temp;
    }
}
public class swapUsingWrapper {
    public static void main(String[] args) {
        Numbers nums = new Numbers(10, 20);
        Numbers.swap(nums);
        System.out.println(nums.a + " " + nums.b);
    }
}
