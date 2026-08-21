package GFG.OOPS;

public class pokemonRevision {
    private static class Pokemon{
        int hp;
        int attack;
        int speed;
        int defense;
        String type;
        String name;


    }
    public static void main(String[ ]args){
        Pokemon p1 = new Pokemon();
        p1.name="Pikachu"; p1.type="Electric"; p1.hp=100; p1.attack=70;
        System.out.println(p1.type);
        Pokemon p2 = new Pokemon();
        p2.name="Charizard"; p2.type="Fire"; p2.attack=113;
        Pokemon p3 = p1;  /*p3 is shallow copy of p1. p3 points to p1. (p3 can control p1)*/
        p3.type = "Water";
        System.out.println(p1.type);
    }
}
