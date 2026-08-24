package GFG.OOPS.KK_04;

public class GetSet{
    protected int num;
    String name;
    int[] arr;

    int getNum(){
        return num;
    }

    void setNum(int num){
        this.num=num;
    }

    GetSet(int num, String name){
        this.num=num;
        this.name = name;
        this.arr=new int[num];
    }
}
