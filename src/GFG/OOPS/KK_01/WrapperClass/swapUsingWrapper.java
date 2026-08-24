package GFG.OOPS.KK_01.WrapperClass;
class   Numbers {
    int a;
    int b;

    Numbers(int a, int b) {
        this.a = a;
        this.b = b;
    }
//    static void swap(Numbers nums) {

        void swap(Numbers nums) {
        int temp = nums.a;
        nums.a = nums.b;
        nums.b = temp;
    }
}
public class swapUsingWrapper {
    public static void main(String[] args) {
        Numbers nums = new Numbers(10, 20);
//        Numbers.swap(nums);
        nums.swap(nums);
        System.out.println(nums.a + " " + nums.b);
    }
}
