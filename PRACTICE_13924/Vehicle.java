class Vehicle {
    public int speed;
    
    public Vehicle() {
        this.speed = 10;
    }

    public void speedUp() {
        System.out.println("Function Speedup");
    }

    public int getspeed() {
        return speed;
    }

    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBicycle = new Bicycle();

        myCar.speedUp();
        myBicycle.speedUp();
        myCar.speedUp();
        myBicycle.speedUp();
    }
}

class Car extends Vehicle {
    @Override
    public void speedUp(){
        speed += 20;
        System.out.println("Car is speeding up. Current speed: " + speed + " km/h");
    }
}

class Bicycle extends Vehicle {
    @Override
    public void speedUp(){
        speed += 5;
        System.out.println("Bicycle is speeding up. Current speed: " + speed + " km/h");
    }
}