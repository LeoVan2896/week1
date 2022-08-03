package Wednesday;

import java.util.Scanner;

public class GradingExercise {
    public static void main(String[] args) {
        //Create Scanner to scan the Grade
        Scanner object = new Scanner(System.in);
        //to input the grade
        System.out.println("Enter the grade: ");
        double grade = object.nextDouble();


        if (grade >= 90) {
            System.out.println("your grade is A");
        }
        else if (grade < 90 && grade >= 80) {
            System.out.println("your grade is B");

        }
        else if (grade < 80 && grade >= 70) {
            System.out.println("your grade is C");

        }
        else if (grade < 70 && grade >= 65 ) {
            System.out.println("your grade is D");

        } else {
            System.out.println("your grade is F, you failed the class ");

        }


    }
}
