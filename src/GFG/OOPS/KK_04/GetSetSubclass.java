package GFG.OOPS.KK_04;

public class GetSetSubclass extends GetSet{
    GetSetSubclass(int num, String name) {
        super(num, name);
    }
    public static void main(String[] args){
        GetSetSubclass obj = new GetSetSubclass(45,"Prasad");
        int x = obj.num;
    }
}
