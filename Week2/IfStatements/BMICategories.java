package Week2.IfStatements;
// activity 36

import java.util.Scanner;

public class BMICategories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height;
        int weight;
        double bmi;
        String category = "";

        System.out.print("What is your height in m? ");
        height = input.nextDouble();
        System.out.print("What is your weight in kg? ");
        weight = input.nextInt();

        bmi = weight / (height * height);
        System.out.println("\nYour BMI is " + bmi);

        if (bmi < 18.5) {
            category = "underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            category = "normal weight";
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            category = "overweight";
        } else if (bmi >= 30.0) {
            category = "obese";
        }

        System.out.println("BMI Category: " + category);
    }
}
