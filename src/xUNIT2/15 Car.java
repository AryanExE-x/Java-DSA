package xUNIT2;

class Car {
    /*attributes/properties/instance variables*/

    static int noOfCarsSold;

    int noOfWheels;

    String color;

    float maxSpeed;

    float currentFuelInLitres;

    int noOfSeats;

    static{
        noOfCarsSold=0;
        System.out.println("I am in Static Block"); /*class ke load hone pe call hota h. only 1 time hota hai call*/
    }
    {


        noOfCarsSold++;
        System.out.println("I am in Initialization Block"); /*every object creation pe call hota hai*/
        System.out.println("The number of cars sold: " + noOfCarsSold);
    }


    Car(String color,int noOfWheels) {  /*when both are passed as an argument*/
        this.color = color;
        this.noOfWheels=noOfWheels;
        maxSpeed = 150;
        currentFuelInLitres = 2;
        noOfSeats = 5;
    }
 
    Car() {  /*when no argument is passed*/
        this("Black",4);  //takes color and wheels as default
    }

    Car(String color) { /*when only color is passed in the argument*/
        this(color, 4);   // default wheels = 4
    }

    Car(int noOfWheels){ /*when only no of wheels are passed in the argument*/
        this("Black",noOfWheels); //default color as black
    }
        /*methods/functions/behaviour*/

    public Car start(){
        if(currentFuelInLitres<=0){
            System.out.println("Car is out of fuel, cannot start");
        }
        else if(currentFuelInLitres<5){
            System.out.println("Car is in reserved mode. Please Refuel");
            currentFuelInLitres--;
        }
        else{
            System.out.println("Car is started...brrrr!!");
        }
        return this;
    }

    public void drive(){
        System.out.println("Car is driving");
        currentFuelInLitres--;  //-1 Litre while driving each time

    }


    public void addFuel(float currentFuelInLitres){
        this.currentFuelInLitres+=currentFuelInLitres;

    }

    public float getCurrentFuelLevel(){
        return currentFuelInLitres;
    }


}
