package xUNIT2.toString;

public class Car {
    int noOfWheels;
    int noOfSeats;
    int noOfDoors;
    String name;
    String modelNo;
    String company;

    public Car(int noOfWheels, int noOfSeats, int noOfDoors, String name, String modelNo, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfSeats = noOfSeats;
        this.noOfDoors = noOfDoors;
        this.name = name;
        this.modelNo = modelNo;
        this.company = company;
    }

//    @Override
//    public String toString() {
    ////      return super.toString();
//        return "My Car name is: " + name ;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", noOfSeats=" + noOfSeats +
                ", noOfDoors=" + noOfDoors +
                ", name='" + name + '\'' +
                ", modelNo='" + modelNo + '\'' +
                ", company='" + company + '\'' +
                '}';
    } 


    static void main(String[] args) {
        Car swift= new Car(4,4,4,"Swift","Dzire","Maruti");
        System.out.println(swift.toString());
    }



}
