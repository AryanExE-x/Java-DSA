package GFG.OOPS.KunalKushwaha_01.GarbageCollector;

public class main {
    static void main(String[] args) {
        final finalize theEnd = new finalize("Aryan Prasad");
        theEnd.name="other name";
        System.out.println(theEnd.name);

        finalize obj;
        for(int i=0;i<1000000;i++){
            obj = new finalize("Random Name");
        }
    }
}
