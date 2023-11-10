package AssignmentJava2;

public class IfElseRent {
    public static void main(String[] args) {
        double groceries = 150.25;
        double transportation = 75.30;
        double entertainment = 200.00;
        double rent = 1200.50;

        if (rent > groceries && rent > entertainment && rent > transportation) {
            System.out.println("Warning: Your rent is the highest expense!");
        } else if (groceries > entertainment && groceries > transportation) {
            System.out.println("Warning: Your groceries are the highest expense!");
        } else if (entertainment > transportation) {
            System.out.println("Warning: Entertainment is your highest expense!");
        } else {
            System.out.println("Warning: Transportation is your highest expense!");
        }}}
