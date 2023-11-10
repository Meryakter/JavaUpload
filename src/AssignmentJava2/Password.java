package AssignmentJava2;

public class Password {
    public static void main(String[] args) {


        int attempts = 0;

        do {
            // For this example, let's assume the user always enters "wrongPassword"
            attempts++;
        } while (attempts < 3);

        System.out.println("Right password");

    }}
