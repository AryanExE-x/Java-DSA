package GFG.OOPS.KK_01.SingletonClass;

public class Singleton {
    private Singleton(){

    }
    private static Singleton instance;  //only one object is created in the memory
    public static Singleton getInstance(){
        //check whether 1 obj is created only or not
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
