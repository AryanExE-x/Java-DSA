package GFG.OOPS.KK_04;

public class GetSet{
    protected int num;
    String name;
    int[] arr;

    int getNum(){
        return num;
    }

    void setNum(int newNum){
        this.num=newNum;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    GetSet(int num, String name){
        this.num=num;
        this.name = name;
        this.arr=new int[num];
    }
}
