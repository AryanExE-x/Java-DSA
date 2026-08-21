package GFG.OOPS;

public class PolyMorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau bhau");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meow meow");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("Rawwwrr");
        }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("Pika pika");
        }
    }

    public static void main(String[] args){
        Dog d = new Dog();
        Cat c = new Cat();
        Lion l = new Lion();
        Pikachu p = new Pikachu();

        d.speak();
        c.speak();
        l.speak();
        p.speak();
    }
}
