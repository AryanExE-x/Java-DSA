package GFG.OOPS;

public class constructors {
    public static class Car{
        int seats;  //!default - 0
        String name;  //!default - null
        double length;  //!default - 0.0
        Car(){   /*Default Constructor*/

        }

        Car(int x, String s){
            this.seats=x;
            name=s;
        }

        Car(int x){
            seats=x;
        }

        Car(int seats, String name, double length){
            this.seats=seats;
            this.name=name;
            this.length=length;
        }
        /*
         *this is constructor overloading.
         */

        void print(){
            System.out.println(seats+" "+name+" "+length);
        }

    }
    public static void main(String[] args){
        Car c1 = new Car(5,"Kia Sonnet",3.99);
        System.out.println(c1.name);
        System.out.println("\n");
        c1.print();
        Car c2 = new Car(7,"Fortuner",4.5);
        c2.length=4.66;
        c2.print();
        Car c3 = new Car(9);
        c3.name="Lord Alto!!";
        c3.print();
        Car c4 = new Car(2,"Nano");
        c4.length=0.45;
        c4.print();

    }
}
