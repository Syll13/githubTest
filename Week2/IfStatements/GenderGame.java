package Week2.IfStatements;
// activity 37
import java.util.Scanner;

public class GenderGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String gender;
        String firstName;
        String lastName;
        int age;
        String married;

        System.out.print("What is your gender (M or F): ");
        gender = input.next();

        System.out.print("First Name: ");
        firstName = input.next();

        System.out.print("Last Name: ");
        lastName = input.next();

        System.out.print("Age: ");
        age = input.nextInt();

        if (gender.equals("F") && age <20) {
            System.out.println("Then I shall call you " + firstName + " " + lastName + ".");
        }

        if (gender.equals("F") && age >= 20) {
            System.out.print("\nAre you married, " + firstName + " (y or n)? ");
            married = input.next();
//        } if (married.equals("y")) {
//            System.out.println("\nThen I shall call you Mrs. " + lastName + ".");
//        } else {
//            System.out.println("\nThen I shall call you Ms. " + lastName + ".");
        }

        if (gender.equals("M") && age > 20) {
            System.out.println("\nThen I shall call you Mr. " + lastName + ".");
        } else {
            System.out.println("\nThen I shall call you " + firstName + " " + lastName + ". ");
        }

    }

}
