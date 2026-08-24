package GFG.OOPS.KK_04;

public class GetterSetterMain {
    public static void main(String [] args){
        GetSet obj = new GetSet(5,"Aryan");
        System.out.println(obj.getNum());
        obj.setNum(6);
        System.out.println(obj.getNum());
        int n = obj.num;
    }
}
