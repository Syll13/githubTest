package Week2.Arrays;
// activity 140
// Create an array that can hold ten integers.
// Fill up each slot of the array with a random number from 1 to 100. T
// hen display the contents of the array on the screen. You must use a loop.
//
//And, like last time, you must use the length field of your array and
// not a literal number (like 10) in the condition of the loop.

import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {
        int[] num = new int[10];

        Random rand = new Random();
        int n = rand.nextInt(100);
        n += 1;

        while ( n < num.length) {
            System.out.println("Slot 0 contains a " + n);
            System.out.println("Slot 1 contains a " + n);
            System.out.println("Slot 2 contains a " + n);
            System.out.println("Slot 3 contains a " + n);
            System.out.println("Slot 4 contains a " + n);
            System.out.println("Slot 5 contains a " + n);
            System.out.println("Slot 6 contains a " + n);
            System.out.println("Slot 7 contains a " + n);
            System.out.println("Slot 8 contains a " + n);
            System.out.println("Slot 9 contains a " + n);
            break;
        }

    }
}
