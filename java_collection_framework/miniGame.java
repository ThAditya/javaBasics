package java_collection_framework;

class car{
    String carName;
    String model;
    String color;
    int torque;
    boolean alloy;
    boolean musicSystem;
    int speed;
    boolean fourbyfour;
    boolean sunroof;

    public car(String carName, String model,String carcolor, int t, boolean allow, boolean musicSystem, boolean sunroof){
        this.carName = carName;
        this.model = model;
        this.color = carcolor;
        this.torque = t;
        this.alloy = allow;
        this.musicSystem = musicSystem;
        this.sunroof = sunroof;
        this.speed = 0;
    }

    public void accelerate(int increasedSpeed){
        speed += increasedSpeed;
        System.out.println();
    }

    public void horn(){
        System.out.println("HONK");
    }

    public void breaking(){
        this.speed = 0;
    }
}

public class miniGame {
    public static void main(String[] args) {
        car vehicle = new car("Scorpio", "s11", "Black", 45, true, true, false);
        vehicle.carName = "Fortuner";
        vehicle.model = "legender";
        vehicle.color = "white";

        System.out.println(vehicle.carName);
        System.out.println(vehicle.color);
        System.out.println(vehicle.torque);
        System.out.println(vehicle.sunroof);
        System.out.println(vehicle.musicSystem);
        System.out.println(vehicle.fourbyfour);

        vehicle.accelerate(20);
        vehicle.horn();
        vehicle.breaking();
        vehicle.accelerate(30);
        vehicle.accelerate(50);
        vehicle.breaking();
    }
}
