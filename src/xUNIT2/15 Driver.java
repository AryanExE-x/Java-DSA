package xUNIT2;

class Driver {

        static int minAgeForDriving=18;
        int age;
        String name;
        String dateOfLicense;

        public boolean isAllowedToDrive(){
            return this.age >= minAgeForDriving;
        }


    public static void main(String[] args){
/*----------------------------------------------------------------------------------------------------*/
        //Car -> Class Name ------> DECLARATION.
        //myCar -> reference variable (Address to the actual object) ------> DECLARATION.
        //new -> instantiator (Keyword)  ------> INSTANTIATION.
        // Car() -> Constructor call (Same Class Name) ------> INITIALIZATION.
        /*Class is a blueprint,objects are real values in memory*/
/*----------------------------------------------------------------------------------------------------*/

//        Car myCar = new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(3);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());

        Car swift= new Car("Red",6);
        swift.addFuel(6);
        Car startedCar = swift.start();  /*only print the car is started*/
        startedCar.drive();  /*only print car is driving*/
        swift.start().drive(); /*prints both started and then driving*/
        System.out.println(swift.color);
        System.out.println(swift.noOfWheels);
        System.out.println("---------------------------");

        Car lambo = new Car("Yellow");
        System.out.println(lambo.color);
        System.out.println(lambo.noOfWheels);
        System.out.println("---------------------------");

        Car ferrari = new Car();
        System.out.println(ferrari.color);
        System.out.println(ferrari.noOfWheels);
        System.out.println("---------------------------");

        Car thar= new Car(15);
        thar.start().drive();
        System.out.println(thar.color);
        System.out.println(thar.noOfWheels);
        System.out.println("---------------------------");

//      Driver myDriver = new Driver();
//      myDriver.dateOfLicense = "1/Jan/2026";
//      System.out.println(Driver.minAgeForDriving);
    }


}
