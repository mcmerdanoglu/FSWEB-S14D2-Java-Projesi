package Main;

import ClassFolder.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("---------------Outputs-------------");
        Bedroom bedroom1 = new Bedroom("family", new Wall("south"), new Wall("west"),
                new Wall("north"), new Wall("east"), new Ceiling(10, PaintColor.PINK),
                new Bed(4, 1, 2, 3, "double"),
                new Lamp(LampType.DIMMER,true, 3), new Wardrobe(5, 8, 3.5),
                new Carpet(5, 2, PaintColor.PURPLE));

        System.out.println("Bedroom1: " + bedroom1.toString());
    }
}