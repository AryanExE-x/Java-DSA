package xUNIT2;

class Car2 {
    String color;
    float maxspeed;
    float currentfuel;
    int seats;

    public void drive(){
        System.out.println("The car is driving..");
        currentfuel--;
    }

    public float getcurrentfuel() {
        return currentfuel;
    }

    public void addmorefuel(float fueltoadd){
        currentfuel+=fueltoadd;
    }

}
