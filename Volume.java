/*
Question:

The volume of oil stored in an underground 200-foot-deep
cylindrical tank is determined by measuring the distance
from the top of the tank to the surface of the oil.Knowing
this distance and the radius of the tank the volume of oil
in the tank can be determined using the formula:

volume = π × radius^2 × (200 − distance)

Using this formula, write a JAVA program that accepts the
radius and the distance measures, calculates the volume of
the oil in the tank, and displays the two input values and
calculates the volume.
 */

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter raduis and distance: ");
        double raduis = input.nextDouble();
        double distance = input.nextDouble();

        double volume = Math.PI * (raduis * raduis) * (200 - distance);
        System.out.print("volume of the oil in the tank = " + volume);
    }
}
