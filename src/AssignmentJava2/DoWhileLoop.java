package AssignmentJava2;
import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
        int attempts = 0;
        String enterPassword;
String password;
password="123gg";
        Scanner p = new Scanner(System.in);
        // 3 attempts to enter password
        do {
            System.out.println("enter password: ");
            enterPassword = p.nextLine();
            attempts++;
        } while (!enterPassword.equals(password) && attempts < 3);

        if (enterPassword.equals(password)) {
            System.out.println("Successfully Logged in");
        } else {
            System.out.println(" reset your password");
        }


    }}