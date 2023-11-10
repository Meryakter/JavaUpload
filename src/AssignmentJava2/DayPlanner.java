package AssignmentJava2;

import java.util.Scanner;

public class DayPlanner {
    public static void main(String[] args) {
        System.out.println("Enter a day: ");
        Scanner d = new Scanner(System.in);
        String day = d.nextLine();
        switch (day) {
            case "Monday":
            case "Thursday":
                System.out.println("Work and gym");
                break;
            case "Tuesday":
                System.out.println("Work and read a book");
                break;
            case "Wednesday":
                System.out.println("Work and grocery shopping");
                break;
            case "Friday":
                System.out.println("Movie night");
                break;
            // ... Add cases for other days as well
            case "Saturday":
                System.out.println("Clean the house");
                break;
            case "Sunday":
                System.out.println("Relax or go hiking");
                break;
            default:
                System.out.println("Invalid day");
        }

    }}
