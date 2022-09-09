package day27_methods;

public class Car {
    /* Algorithm for using car

    unlock car
    open door
    sit and start
    check mirrors
    seatbelt
    adjust seat
    put to drive
     */


    public static void unlock() {
        System.out.println("unlocking car");


    }

    public static void openDoor() {
        System.out.println("opening the door");

    }

    public static void sitAndStart() {
        System.out.println("Sitting down in seat");
        System.out.println("Then insert key");
        System.out.println("start the car");

    }

    public static void checkMirrors() {

        System.out.println("checling left mirror");
        System.out.println("checking rear view mirror");
        System.out.println("checking right mirror");

    }

    public static void putOnSeatbelt() {
        System.out.println("Putting on seatbelt");

    }

    public static void drive() {
        System.out.println("putting into drive");
        System.out.println("driving");

    }
    public static void late(){
        unlock();
        openDoor();
        sitAndStart();
        drive();

    }

    public static void main(String[] args) {
        unlock();
        openDoor();
        sitAndStart();
        checkMirrors();
        putOnSeatbelt();
        drive();

        System.out.println();

        late();
    }

}
