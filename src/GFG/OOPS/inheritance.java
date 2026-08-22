package GFG.OOPS;

class Pokemon{  /*parent class*/
    String type;
    int power;
    Pokemon(String type, int power){
        this.power=power;
        this.type=type;
    }
    Pokemon(){

    }
    void print(){
        System.out.println(this.power + " " + this.type);
    }
}
class StrongPokemon extends Pokemon{ /*child class*/
    int speed;
    StrongPokemon(String type, int power, int speed){
        super(type,power);
        this.speed=speed;
    }
}

class LegendaryPokemon extends Pokemon{ /*child class-extra attributes extending from Pokemon class*/
    String ability;  /*subclassifications*/
}

class GodPokemon extends LegendaryPokemon{
    char tag;
}

public class inheritance {
    public static void main(String[] args){
        LegendaryPokemon mewtwo = new LegendaryPokemon();
        mewtwo.power=110;
        mewtwo.ability="Pressure";
        Pokemon pikachu = new Pokemon();
        pikachu.power=91;
        GodPokemon dialga = new GodPokemon();
        dialga.tag='S';
        StrongPokemon ssss = new StrongPokemon("ashes",99,80);
        ssss.print();

    }

}
