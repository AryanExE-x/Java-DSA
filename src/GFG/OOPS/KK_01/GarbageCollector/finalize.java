package GFG.OOPS.KK_01.GarbageCollector;

public class finalize {
    final int num =10;
    String name;
    public finalize(String name){
        System.out.println("Object created");
        this.name=name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
