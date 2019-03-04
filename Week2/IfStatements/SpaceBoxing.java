package Week2.IfStatements;
// activity 26

import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight;
        int planet;
        double planetWeight = 0;

        System.out.print("Please enter your current earth weight: ");
        weight = input.nextDouble();

        System.out.println("\nI have information for the following planets: ");
        System.out.print("   1. Venus      2. Mars       3. Jupiter \n   4. Saturn     5. Uranus     6. Neptune");
        System.out.print("\n \nWhich planet are you visiting? ");
        planet = input.nextInt();

        if (planet == 1) {
            planetWeight = weight * 0.78;
        } else if (planet == 2) {
            planetWeight = weight * 0.39;
        } else if (planet == 3) {
            planetWeight = weight * 2.65;
        } else if (planet == 4) {
            planetWeight = weight * 1.17;
        } else if (planet == 5) {
            planetWeight = weight * 1.05;
        } else if (planet == 6) {
            planetWeight = weight * 1.23;
        }

        System.out.println("\nYour weight would be " + planetWeight + " pounds on that planet.");
    }
}
