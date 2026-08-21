package GFG.OOPS;

public class pokemonConstructor {
    private static class Pokemon{
        int power;
        String type;
        Pokemon(String t, int p){
            this.type=t;
            this.power=p;
        }
    }
    public static void main(String[ ]args){
        Pokemon pikachu = new Pokemon("Electric",70);
        Pokemon jigglypuff = new Pokemon("Fairy",45);
    }

}
