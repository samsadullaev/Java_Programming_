package day35_constructor_classes.Road;

import day35_constructor_classes.Road.TrafficLight;

public class Road {
    public static void main(String[] args) {

        TrafficLight light = new TrafficLight("green");
        // light.color = "red";
        System.out.println(light.color);

        // invalid case:
        TrafficLight light2 = new TrafficLight("blue");
        //light2.color = "blue"
        System.out.println(light2.color);


    }
}
