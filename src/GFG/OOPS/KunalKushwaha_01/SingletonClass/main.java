package GFG.OOPS.KunalKushwaha_01.SingletonClass;

public class main {
    public static void main(String [] args){
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        //* all 3 reference variables are pointing to just 1 object
    }
}
